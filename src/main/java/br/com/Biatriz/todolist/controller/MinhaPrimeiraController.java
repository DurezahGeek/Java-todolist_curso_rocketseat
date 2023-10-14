package br.com.Biatriz.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {

    /**
     * Métodos de acesso do HTTP
     * GET- Buscar uma informação
     * POST- Adcionar um dado/informação
     * PUT- Alterar um dado/info
     * DELETE - REmover um dado
     * PATCH - Alterar somente uma parte da info/dado
     */

    //Método (Funcionlidade) de uma classe
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
