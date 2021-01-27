package com.animais.jogoanimais.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesafioController {

    @GetMapping(value = "/")
    public String getMethodName() {
        return "Jogo dos Animais";
    }

}
