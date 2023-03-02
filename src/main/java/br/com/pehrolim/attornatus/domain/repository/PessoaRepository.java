package br.com.pehrolim.attornatus.domain.repository;

import br.com.pehrolim.attornatus.domain.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
