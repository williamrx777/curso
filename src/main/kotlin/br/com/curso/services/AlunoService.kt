package br.com.curso.services

import br.com.curso.models.Aluno
import br.com.curso.repositories.AlunoRepository
import org.springframework.stereotype.Service

@Service
class AlunoService(private val alunoRepository: AlunoRepository) {

    fun getAllAluno(): List<Aluno> = alunoRepository.findAll();

    fun createAluno(aluno: Aluno): Aluno = alunoRepository.save(aluno);

    fun getOneAluno(id:Long): Aluno? = alunoRepository.findById(id).orElse(null);

    fun updateAluno(aluno: Aluno): Aluno = alunoRepository.save(aluno);

    fun deleteAluno(id: Long) = alunoRepository.deleteById(id);
}