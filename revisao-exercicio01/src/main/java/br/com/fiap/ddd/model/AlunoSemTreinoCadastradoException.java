package br.com.fiap.ddd.model;

public class AlunoSemTreinoCadastradoException extends RuntimeException {
	
	public AlunoSemTreinoCadastradoException(String mensagemDeErro) {
		super(mensagemDeErro);
	}

}
