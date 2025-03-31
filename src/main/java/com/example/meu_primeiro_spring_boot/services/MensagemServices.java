package com.example.meu_primeiro_spring_boot.services;

import org.springframework.stereotype.Service;

import com.example.meu_primeiro_spring_boot.repository.MensagemRepository;

@Service
public class MensagemServices {
    
    private final MensagemRepository mensagemRepository;

    public MensagemServices(MensagemRepository mensagemRepository){
        this.mensagemRepository = mensagemRepository;
    }

    public String obterMensagem(){
        return mensagemRepository.obterMensagem();
    }

}
