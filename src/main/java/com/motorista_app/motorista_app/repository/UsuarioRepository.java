package com.motorista_app.motorista_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motorista_app.motorista_app.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    Usuario findByUsuario(String usuario);
} 