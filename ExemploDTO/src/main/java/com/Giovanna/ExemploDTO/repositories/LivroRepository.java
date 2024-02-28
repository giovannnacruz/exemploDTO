package com.Giovanna.ExemploDTO.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Giovanna.ExemploDTO.entities.Livro;


public interface LivroRepository extends JpaRepository<Livro, Long> {

}
