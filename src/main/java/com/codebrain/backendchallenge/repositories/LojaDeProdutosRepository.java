package com.codebrain.backendchallenge.repositories;

import com.codebrain.backendchallenge.domain.LojaDeProdutos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LojaDeProdutosRepository extends JpaRepository<LojaDeProdutos,Integer> {
    
}
