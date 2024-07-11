package voll.me.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import voll.me.api.medico.DadosCadastroMedico;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        System.out.println(dados);
    }

}
