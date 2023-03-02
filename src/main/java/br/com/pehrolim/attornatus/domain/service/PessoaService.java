package br.com.pehrolim.attornatus.domain.service;

import br.com.pehrolim.attornatus.domain.model.Pessoa;
import br.com.pehrolim.attornatus.domain.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa salvar(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public void deletar(Long pessoaId){
        try {
            pessoaRepository.deleteById(pessoaId);
        }catch (EmptyResultDataAccessException ex){
            throw new RuntimeException();
        }
    }

    public Pessoa buscarOuFalhar(Long pessoaId){
        return pessoaRepository.findById(pessoaId).orElseThrow();

    }



}
