package org.example.trabalhovitorspring.model.repository;

import org.example.trabalhovitorspring.model.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
