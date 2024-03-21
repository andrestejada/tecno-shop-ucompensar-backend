package com.tecno.shop.ucompensar.tecnoshopucompensar.services;

import com.tecno.shop.ucompensar.tecnoshopucompensar.DTOS.CrearUsuarioDTO;
import com.tecno.shop.ucompensar.tecnoshopucompensar.models.Usuario;
import com.tecno.shop.ucompensar.tecnoshopucompensar.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service()
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario crearUsuario(CrearUsuarioDTO usuarioDTO){
        Usuario usuarioGuarda = new Usuario();
        usuarioGuarda.setNombre(usuarioDTO.nombre);
        usuarioGuarda.setCorreo(usuarioDTO.correo);
        usuarioGuarda.setPassword(usuarioDTO.password);
        return this.usuarioRepository.save(usuarioGuarda);
    }

    public Usuario obtenerUsuarioPorCorreo(String correo){
        return this.usuarioRepository.findByCorreo(correo);
    }

    public Optional<Usuario> obtenerUsuarioPorId(Integer usuarioId){
        return this.usuarioRepository.findById(usuarioId);
   }
}
