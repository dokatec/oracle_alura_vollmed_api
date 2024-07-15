package voll.me.api.paciente;

import jakarta.validation.Valid;
import voll.me.api.medico.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco) {

}
