package voll.me.api.controller;

import jakarta.validation.Valid;
import voll.me.api.domain.consulta.AgendaDeConsultas;
import voll.me.api.domain.consulta.DadosAgendamentoConsulta;
import voll.me.api.domain.consulta.DadosCancelamentoConsulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("consultas")

public class ConsultaController {

    @Autowired
    private AgendaDeConsultas agenda;

    @SuppressWarnings("rawtypes")
    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DadosAgendamentoConsulta dados) {
        var dto = agenda.agendar(dados);
        return ResponseEntity.ok(dto);
    }

    @SuppressWarnings("rawtypes")
    @DeleteMapping
    @Transactional
    public ResponseEntity cancelar(@RequestBody @Valid DadosCancelamentoConsulta dados) {
        agenda.cancelar(dados);
        return ResponseEntity.noContent().build();
    }

}
