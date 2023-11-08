package br.com.curso.repositories;

import br.com.curso.models.Aluno
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository : JpaRepository<Aluno, Long> {
}
