package br.com.enderecousuario.controle.repository;

import br.com.enderecousuario.controle.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
   Optional<Usuario> findAllById(Long id);
}
