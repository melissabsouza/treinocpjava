package br.com.fiap.ddd.repositorios;

import br.com.fiap.ddd.model.Aluno;
import br.com.fiap.ddd.model.AlunoComMatriculaDuplicadaException;

public class TesteRepositorio {
	public static void main(String[] args) {
		AlunoRepositoryFactory factory = new AlunoRepositoryFactory();
		
		AlunoRepository repositorio = factory.getAlunoRepository(TipoImplementacao.MEMORIA);
		
		Aluno aluno = new Aluno("Daniel", "pf1824");
		
		repositorio.adicionarAluno(aluno);
		
		try {
			repositorio.adicionarAluno(aluno);
		} catch(AlunoComMatriculaDuplicadaException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Fim");
	}
}
