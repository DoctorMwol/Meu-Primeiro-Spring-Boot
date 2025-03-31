package com.example.meu_primeiro_spring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.meu_primeiro_spring_boot.repository.MensagemRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class MensagemController {

    private final MensagemRepository mensagemRepository;

    public MensagemController(MensagemRepository mensagemRepository){
        this.mensagemRepository = mensagemRepository;
    }

    @GetMapping("/mensagem")
    public String getMethodName() {
        return mensagemRepository.obterMensagem();
    }
    
    
}
