package com.motorista_app.motorista_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motorista_app.motorista_app.model.Usuario;
import com.motorista_app.motorista_app.repository.UsuarioRepository;

@RestController
@CrossOrigin    
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @CrossOrigin
    @GetMapping
    public List<Usuario> listar(){
        return repository.findAll();

    }
    @PostMapping
    public Usuario adicionar(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }
    @PostMapping("/auth")
    public ResponseEntity<Usuario> login(@RequestBody Usuario user) {
        Usuario usuario = repository.findByUsuario(user.getUsuario());
        if (usuario != null && usuario.getSenha().equals(user.getSenha())) {
            usuario.setSenha(null);
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
