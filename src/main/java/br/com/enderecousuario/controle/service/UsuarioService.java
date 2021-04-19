package br.com.enderecousuario.controle.service;

import br.com.enderecousuario.controle.model.Usuario;
import br.com.enderecousuario.controle.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario create(Usuario usuario) {
        try {
            return usuarioRepository.save(usuario);
        } catch (DataIntegrityViolationException e) {
            return null;
        }
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findAllById(Long id) {
        return usuarioRepository.findAllById(id);
    }

    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
