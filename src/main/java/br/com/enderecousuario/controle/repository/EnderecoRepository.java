package br.com.enderecousuario.controle.repository;

import br.com.enderecousuario.controle.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
