package voll.me.api.domain.consulta;

import java.time.LocalDateTime;

import voll.me.api.domain.medico.Medico;
import voll.me.api.domain.paciente.Paciente;

public record DadosDetalhamentoConsulta(Long id, Medico medico, Paciente paciente, LocalDateTime data) {

    public DadosDetalhamentoConsulta(Consulta consulta) {
        this(consulta.getId(), consulta.getMedico(), consulta.getPaciente(), consulta.getData());
    }
}
