package br.com.fiap.ddd.repositorios;

public class AlunoRepositoryFactory {
	
	public AlunoRepository getAlunoRepository(TipoImplementacao tipo) {
		
		if(tipo == TipoImplementacao.MEMORIA) {
			
			return new AlunoRepositoryEmMemoria();
		} else{
			throw new IllegalArgumentException("opcao nao implementada");
		}
	}

}
