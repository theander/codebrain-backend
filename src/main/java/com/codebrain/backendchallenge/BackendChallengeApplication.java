package com.codebrain.backendchallenge;

import com.codebrain.backendchallenge.repositories.LojaDeProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendChallengeApplication {
@Autowired
LojaDeProdutosRepository loja;
	public static void main(String[] args) {
		SpringApplication.run(BackendChallengeApplication.class, args);
	}

	
	

}
