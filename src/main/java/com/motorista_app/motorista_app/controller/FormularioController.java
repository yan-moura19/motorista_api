package com.motorista_app.motorista_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.motorista_app.motorista_app.model.Formulario;
import com.motorista_app.motorista_app.repository.FormularioRepository;

@CrossOrigin
@RestController
@RequestMapping("/formularios")
public class FormularioController {

    @Autowired
    private FormularioRepository repository;
    @CrossOrigin
    @GetMapping
    public List<Formulario>  listarFormularios(){
        return repository.findAll();
    }
    @PostMapping
    public Formulario adicFormulario(@RequestBody Formulario formulario){
        return repository.save(formulario);
    }
    @GetMapping("/{idMotorista}")
    public List<Formulario> listarFormulariosPorMotorista(@PathVariable  String idMotorista) {
      
        return repository.findByIdMotorista(idMotorista);
    }
    
}
