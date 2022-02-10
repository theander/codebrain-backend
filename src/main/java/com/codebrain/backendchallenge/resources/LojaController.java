package com.codebrain.backendchallenge.resources;

import java.util.ArrayList;
import java.util.List;

import com.codebrain.backendchallenge.domain.LojaDeProdutos;
import com.codebrain.backendchallenge.domain.Produto;
import com.codebrain.backendchallenge.service.LojaDeProdutosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/loja-de-produtos")
@CrossOrigin
public class LojaController {
    @Autowired
    private LojaDeProdutosService loja;

    @GetMapping(value = "/")
    public LojaDeProdutos get() {
        Produto p = new Produto();
        p.setNome("Maçã");
        p.setPreco(8.50);
        p.setImage("https://www.collinsdictionary.com/images/thumb/apple_158989157_250.jpg?version=4.0.219");

        Produto p1 = new Produto();
        p1.setNome("Banana");
        p1.setPreco(3.50);
        p1.setImage("https://cd.shoppub.com.br/cenourao/media/cache/c5/d4/c5d47113c865eee2d507b8226bf7841b.png");

        Produto p2 = new Produto();
        p2.setNome("Pera");
        p2.setPreco(1.50);
        p2.setImage("https://conteudo.imguol.com.br/c/entretenimento/4e/2020/03/23/pera-1584989626321_v2_900x506.jpg");

        LojaDeProdutos lp = new LojaDeProdutos();

        lp.getListaDeProdutos().add(p);
        lp.getListaDeProdutos().add(p1);
        lp.getListaDeProdutos().add(p2);

        return lp;
    }

}
