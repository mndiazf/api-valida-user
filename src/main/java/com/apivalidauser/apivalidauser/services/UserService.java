package com.apivalidauser.apivalidauser.services;

import com.apivalidauser.apivalidauser.models.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<UserEntity> users = new ArrayList<>();

    public UserService() {
        // Agregar usuarios de prueba en el constructor
        users.add(new UserEntity("Usuario1"));
        users.add(new UserEntity("Usuario2"));
    }

    public boolean validarUsuario(String nombreUsuario) {
        return users.stream()
                .anyMatch(usuario -> usuario.getUsername().equals(nombreUsuario));
    }
}