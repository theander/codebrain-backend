package com.codebrain.backendchallenge.repositories;

import com.codebrain.backendchallenge.domain.Venda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VendaRepository extends JpaRepository<Venda,Integer> {
    
}
