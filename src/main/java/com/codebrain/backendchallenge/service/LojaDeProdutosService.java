package com.codebrain.backendchallenge.service;

import com.codebrain.backendchallenge.domain.LojaDeProdutos;
import com.codebrain.backendchallenge.repositories.LojaDeProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LojaDeProdutosService {

    @Autowired
    private LojaDeProdutosRepository produtos;

    public LojaDeProdutos getLoja(){
        return  produtos.findAll().get(0);
    }
}
