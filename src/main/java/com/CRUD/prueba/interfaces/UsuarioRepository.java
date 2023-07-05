package com.CRUD.prueba.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD.prueba.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
