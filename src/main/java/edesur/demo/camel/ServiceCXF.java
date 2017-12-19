package edesur.demo.camel;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Random;

@Path("/")
@Api(value = "/", description = "Servicio de procesamiento de actuación genérica")
public class ServiceCXF {
    private static final Logger logger = LoggerFactory.getLogger(ServiceCXF.class);

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "procesar solicitud")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "request invalido")
    })
    public Response process(@ApiParam(value = "request", required = true) ServiceRequest request) {
        logger.info("procesando orden: {}", request.getNumeroCasoSFDC());

        String ordenId = generateID(15);

        ServiceResponse response =  new ServiceResponse();
        response.setCodigoResultado("OK");
        response.setNumeroOrden(ordenId);

        return  Response.ok().entity(response).build();
    }

    public String generateID(int length) {
        Random random = new Random();
        char[] digits = new char[length];
        for (int i = 0; i < length; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return new String(digits);
    }
}
