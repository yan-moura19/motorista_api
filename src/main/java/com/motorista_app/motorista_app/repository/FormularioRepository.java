package com.motorista_app.motorista_app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motorista_app.motorista_app.model.Formulario;

public interface FormularioRepository extends JpaRepository<Formulario, Long> {

    List<Formulario> findByIdMotorista(String idMotorista);

    
} 