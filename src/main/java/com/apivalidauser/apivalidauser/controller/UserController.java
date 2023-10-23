package com.apivalidauser.apivalidauser.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.apivalidauser.apivalidauser.services.UserService;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/validar-usuario/{nombreUsuario}")
    public ResponseEntity<Boolean> validarUsuario(@PathVariable String nombreUsuario) {
        boolean existeUsuario = userService.validarUsuario(nombreUsuario);
        return ResponseEntity.ok(existeUsuario);
    }
}