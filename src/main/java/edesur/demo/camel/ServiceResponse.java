package edesur.demo.camel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@ApiModel(value="ServiceResponse")
public class ServiceResponse {
    @ApiModelProperty(value="Código único del Resultado.")
    private String codigoResultado;

    @ApiModelProperty(value="Mensaje del Resultado.")
    private String descripcionResultado;

    @ApiModelProperty(value="Identificador de la solicitud generada en synergia.")
    private String numeroOrden;

    public String getCodigoResultado() {
        return codigoResultado;
    }

    public void setCodigoResultado(String codigoResultado) {
        this.codigoResultado = codigoResultado;
    }

    public String getDescripcionResultado() {
        return descripcionResultado;
    }

    public void setDescripcionResultado(String descripcionResultado) {
        this.descripcionResultado = descripcionResultado;
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }
}
