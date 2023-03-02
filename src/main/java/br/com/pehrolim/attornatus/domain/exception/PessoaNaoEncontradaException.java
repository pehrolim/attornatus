package br.com.pehrolim.attornatus.domain.exception;

public class PessoaNaoEncontradaException extends EntidadeNaoEncontradaException{

    private static final long serialVersionUID = 1L;

    public PessoaNaoEncontradaException(String message) {
        super(message);
    }

    public PessoaNaoEncontradaException(Long pessoaId) {
        this(String.format("Não existe um cadastro de Pessoa com código %d", pessoaId));
    }

}
