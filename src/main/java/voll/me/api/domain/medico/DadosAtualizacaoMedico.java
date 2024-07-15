package voll.me.api.domain.medico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
                @NotNull Long id,
                String nome,
                String telefone,
                DadosEndereco endereco) {

}
