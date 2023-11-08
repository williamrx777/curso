package br.com.curso.models

import jakarta.persistence.*
import lombok.Data

@Entity
@Table(name = "alunos")
@Data
data class Aluno(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val nome: String,
        val turma: Integer  ,
        @Enumerated(EnumType.STRING)
        val status:Status ,
        @Enumerated(EnumType.STRING)
        val curso: Curso
)
