package br.com.pehrolim.attornatus.domain.repository;

import br.com.pehrolim.attornatus.domain.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
