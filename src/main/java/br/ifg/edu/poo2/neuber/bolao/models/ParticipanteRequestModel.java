package br.ifg.edu.poo2.neuber.bolao.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@ApiModel(value = "ParticipanteRequestModel", description = "Model para input e update de Participante")
public class ParticipanteRequestModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "Nome completo", required = true)
    private String nome;

    @ApiModelProperty(value = "Ramal", required = true)
    private int ramal;

    @ApiModelProperty(value = )

}
