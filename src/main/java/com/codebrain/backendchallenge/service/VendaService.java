package com.codebrain.backendchallenge.service;

import java.util.List;

import com.codebrain.backendchallenge.domain.Venda;
import com.codebrain.backendchallenge.repositories.VendaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class VendaService {
    @Autowired
    private VendaRepository repo;

    public Venda saveVenda(@RequestBody Venda venda){
        return repo.save(venda);
    }

    public List<Venda> getVendas(){
        return repo.findAll();
    }
}
