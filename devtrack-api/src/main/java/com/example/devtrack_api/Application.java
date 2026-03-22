package com.example.devtrack_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/contato")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping
    public String listar() {
        return "Lista de contatos!";
    }

    @PostMapping
    public String criar() {
        return "Contato criado!";
    }

    @PutMapping
    public String atualizar() {
        return "Contato atualizado!";
    }

    @DeleteMapping
    public String deletar() {
        return "Contato deletado!";
    }
}