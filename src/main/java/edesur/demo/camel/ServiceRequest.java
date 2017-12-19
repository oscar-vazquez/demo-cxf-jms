package edesur.demo.camel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@ApiModel(value="ServiceRequest")
public class ServiceRequest {

    @ApiModelProperty(value="Identificador del caso de SFDC.")
    private String numeroCasoSFDC;

    @ApiModelProperty(value="Identificador del suministro")
    private String numeroSuministro;

    @ApiModelProperty(value="Razón del caso.")
    private String motivo;

    @ApiModelProperty(value="Comentarios que pueda añadir el ejecutivo.")
    private String comentarios;

    public String getNumeroCasoSFDC() {
        return numeroCasoSFDC;
    }

    public void setNumeroCasoSFDC(String numeroCasoSFDC) {
        this.numeroCasoSFDC = numeroCasoSFDC;
    }

    public String getNumeroSuministro() {
        return numeroSuministro;
    }

    public void setNumeroSuministro(String numeroSuministro) {
        this.numeroSuministro = numeroSuministro;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
