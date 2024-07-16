package voll.me.api.domain.consulta;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import voll.me.api.domain.medico.Especialidade;

public record DadosAgendamentoConsulta(

                Long idMedico, @NotNull Long idPaciente, @NotNull @Future LocalDateTime data,
                Especialidade especialidade

) {

}
