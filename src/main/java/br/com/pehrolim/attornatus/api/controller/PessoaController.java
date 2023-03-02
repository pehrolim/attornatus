package br.com.pehrolim.attornatus.api.controller;

import br.com.pehrolim.attornatus.domain.model.Pessoa;
import br.com.pehrolim.attornatus.domain.repository.PessoaRepository;
import br.com.pehrolim.attornatus.domain.service.PessoaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller(value = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoa> listar(){
        return pessoaRepository.findAll();
    }

    @GetMapping(value = "/{pessoaId}")
    public Pessoa buscar(@PathVariable Long pessoaId){
        return pessoaService.buscarOuFalhar(pessoaId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa adicionar(@RequestBody Pessoa pessoa){
        return pessoaService.salvar(pessoa);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long pessoaId){
        pessoaService.deletar(pessoaId);
    }

    @PutMapping(value = "/{pessoaId}")
    public Pessoa editar(@PathVariable Long pessoaId,
                         @RequestBody Pessoa pessoa){

        Pessoa pessoaAtual = pessoaService.buscarOuFalhar(pessoaId);
        BeanUtils.copyProperties(pessoa, pessoaAtual, "id");
        return pessoaService.salvar(pessoaAtual);

    }


}
