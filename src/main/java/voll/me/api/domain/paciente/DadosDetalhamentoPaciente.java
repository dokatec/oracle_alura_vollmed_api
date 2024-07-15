package voll.me.api.domain.paciente;

import voll.me.api.domain.medico.Endereco;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String telefone, String cpf,
        Endereco endereco) {
    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(),
                paciente.getEndereco());
    }

}
