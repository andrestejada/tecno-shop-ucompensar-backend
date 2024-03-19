package com.tecno.shop.ucompensar.tecnoshopucompensar.services;

import com.tecno.shop.ucompensar.tecnoshopucompensar.DTOS.CrearUsuarioDTO;
import com.tecno.shop.ucompensar.tecnoshopucompensar.DTOS.LoginDTO;
import com.tecno.shop.ucompensar.tecnoshopucompensar.DTOS.UsuarioAuthDTO;
import com.tecno.shop.ucompensar.tecnoshopucompensar.models.Usuario;
import com.tecno.shop.ucompensar.tecnoshopucompensar.utils.BadRequestException;
import com.tecno.shop.ucompensar.tecnoshopucompensar.utils.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthService {

    @Autowired
    UsuarioService usuarioService;

    public void registrar(CrearUsuarioDTO usuario){
        Usuario usuarioEncontrado = this.usuarioService.obtenerUsuarioPorCorreo(usuario.correo);
        if(usuarioEncontrado != null){
            throw new BadRequestException("Usuario con correo " + usuario.correo + " ya existe");
        }
        this.usuarioService.crearUsuario(usuario);

    }

    public UsuarioAuthDTO login(LoginDTO usuario){
        Usuario usuarioEncontrado = this.usuarioService.obtenerUsuarioPorCorreo(usuario.correo);
        if(usuarioEncontrado == null){
            throw new BadRequestException("Usuario con correo " + usuario.correo + " no existe");
        }
        if(!Objects.equals(usuario.password, usuarioEncontrado.getPassword())){
            throw new UnauthorizedException("correo o contraseña incorrectos");
        }
        return new UsuarioAuthDTO(usuarioEncontrado.getId(),usuarioEncontrado.getNombre(),usuarioEncontrado.getCorreo());
    }
}
