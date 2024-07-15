package voll.me.api.domain.paciente;

import jakarta.validation.Valid;
import voll.me.api.domain.medico.DadosEndereco;

public record DadosAtualizacaoPaciente(
                Long id,
                String nome,
                String telefone,
                @Valid DadosEndereco endereco) {

}
