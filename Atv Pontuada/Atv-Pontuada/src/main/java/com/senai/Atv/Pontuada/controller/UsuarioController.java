package com.senai.Atv.Pontuada.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.*;

@RequestMapping

public class UsuarioController {

    public usuaruioController(usuarioService usuarioService) {
        this UsuarioService = usuarioController;

    }

    @GetMapping
    public usuarioController List

    <Usuario> listar() {
        return UsuarioService.listarTodos();

    }

    @PostMapping
    public ResponseEntity List = list;

    }

    @PutMapping
    public ResponseEntity<Usuario> atualizar(@Validated @Requesbody)
}
