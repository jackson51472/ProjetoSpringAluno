package org.example.trabalhovitorspring.controller;

import org.example.trabalhovitorspring.model.entity.Aluno;
import org.example.trabalhovitorspring.model.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {

    @Autowired
    private  AlunoRepository alunoRepository;

    @GetMapping("/ola")
    public String ola(){
        return "Ola mundo";
    }

    @GetMapping("/list")
    public List<Aluno> list(){
        return alunoRepository.findAll();
    }
}
