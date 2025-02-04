package com.senai.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.ecommerce.entities.Categoria;

public interface CategoriaRepositories extends JpaRepository<Categoria, Long> {

}
