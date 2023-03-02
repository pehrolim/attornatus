package br.com.pehrolim.attornatus.domain.exception;

public class EnderecoNaoEncontradoException extends EntidadeNaoEncontradaException{
    public EnderecoNaoEncontradoException(String message) {
        super(message);
    }

    public EnderecoNaoEncontradoException(Long enderecoId){
        this(String.format("Não existe um cadastro de endereço com código %d", enderecoId));
    }
}
