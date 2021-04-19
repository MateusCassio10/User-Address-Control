package br.com.enderecousuario.controle.controller;

import br.com.enderecousuario.controle.model.Usuario;
import br.com.enderecousuario.controle.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(path = "/usuario/save")
    public ResponseEntity cadastraUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioSaved = usuarioService.create(usuario);
        if (usuarioSaved == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(path = "/usuario")
    public List<Usuario> buscarUsuario() {
        return usuarioService.findAll();
    }

    @GetMapping(path = "/usuario/id/{id}")
    public Optional<Usuario> buscaUsuarioPorId(@PathVariable(name = "id", required = true) Long id) {
        return usuarioService.findAllById(id);
    }
}
