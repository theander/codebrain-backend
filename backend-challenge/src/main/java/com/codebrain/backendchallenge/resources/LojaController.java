package com.codebrain.backendchallenge.resources;

import com.codebrain.backendchallenge.domain.LojaDeProdutos;
import com.codebrain.backendchallenge.repositories.LojaDeProdutosRepository;
import com.codebrain.backendchallenge.service.LojaDeProdutosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/loja-de-produtos")
public class LojaController {
    @Autowired
    private LojaDeProdutosService loja;

    @GetMapping("/")
    public LojaDeProdutos get() {
        return loja.getAll();
    }


    
}
