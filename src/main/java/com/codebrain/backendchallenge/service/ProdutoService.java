package com.codebrain.backendchallenge.service;
import java.util.List;

import com.codebrain.backendchallenge.domain.Produto;
import com.codebrain.backendchallenge.repositories.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repo;

    public List<Produto> getProdutos(){
        return  repo.findAll();
    }

    public Produto saveProduto(Produto produto) {
        return repo.save(produto);
    }
}
