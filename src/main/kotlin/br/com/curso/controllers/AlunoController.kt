package br.com.curso.controllers;

import br.com.curso.models.Aluno
import br.com.curso.services.AlunoService
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController(private val alunoService: AlunoService) {

    @GetMapping
   fun getAllAluno(): ResponseEntity<kotlin.collections.List<Aluno>> = ResponseEntity.ok(alunoService.getAllAluno());

    @PostMapping
    fun createAluno(@RequestBody aluno: Aluno): ResponseEntity<Aluno> = ResponseEntity.status(HttpStatus.CREATED).body(alunoService.createAluno(aluno));

    @GetMapping("/{id}")
    fun getOneAluno(@PathVariable id: Long): ResponseEntity<Aluno> = ResponseEntity.ok(alunoService.getOneAluno(id));

    @PutMapping("/{id}")
    fun updateAluno(@PathVariable id:Long, @RequestBody aluno: Aluno): ResponseEntity<Aluno> {
        if (aluno.id == id){
            return ResponseEntity.ok(alunoService.updateAluno(aluno))
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    fun deleteAluno(@PathVariable id: Long): ResponseEntity<Void> {
        alunoService.deleteAluno(id)
        return ResponseEntity.noContent().build();
    }

}
