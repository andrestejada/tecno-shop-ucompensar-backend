package com.tecno.shop.ucompensar.tecnoshopucompensar.controllers;


import com.tecno.shop.ucompensar.tecnoshopucompensar.DTOS.CrearUsuarioDTO;
import com.tecno.shop.ucompensar.tecnoshopucompensar.DTOS.LoginDTO;
import com.tecno.shop.ucompensar.tecnoshopucompensar.DTOS.UsuarioAuthDTO;
import com.tecno.shop.ucompensar.tecnoshopucompensar.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/auth")
@RestController
public class AuthController {
    @Autowired
    AuthService authService;

    @PostMapping("/registrar")
    void registrar(@RequestBody CrearUsuarioDTO usuario ){
        this.authService.registrar(usuario);
    }

    @PostMapping("/login")
    UsuarioAuthDTO login(@RequestBody LoginDTO usuario){
        return this.authService.login(usuario);
    }
}
