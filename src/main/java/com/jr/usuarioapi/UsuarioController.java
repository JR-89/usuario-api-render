package com.jr.usuarioapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioActualizado) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow();
        usuario.setNombre(usuarioActualizado.getNombre());
        usuario.setEmail(usuarioActualizado.getEmail());
        return usuarioRepository.save(usuario);
    }
}
