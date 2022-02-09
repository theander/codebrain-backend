package com.codebrain.backendchallenge.service;

import java.util.List;

import com.codebrain.backendchallenge.domain.LojaDeProdutos;
import com.codebrain.backendchallenge.domain.Produto;
import com.codebrain.backendchallenge.repositories.LojaDeProdutosRepository;
import com.codebrain.backendchallenge.repositories.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LojaDeProdutosService {

    @Autowired
    private LojaDeProdutosRepository produtos;

    public LojaDeProdutos getAll(){
        
        return produtos.findAll().get(0);
    }
}
