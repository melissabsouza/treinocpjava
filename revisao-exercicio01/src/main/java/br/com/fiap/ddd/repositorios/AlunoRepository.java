package br.com.fiap.ddd.repositorios;

import br.com.fiap.ddd.model.Aluno;
import br.com.fiap.ddd.model.AlunoComMatriculaDuplicadaException;

public abstract class AlunoRepository {
	
	
	public abstract Aluno buscarPorMatricula(String matricula);
	protected abstract void salvarAluno(Aluno aluno);
	
	public void adicionarAluno(Aluno aluno) {
		
		if(aluno == null) {
			
			throw new IllegalArgumentException();
		}
		
		if(this.buscarPorMatricula(aluno.getMatricula()) != null) {
			throw new AlunoComMatriculaDuplicadaException("aluno com matricula ja existente");			
		}
		
		this.salvarAluno(aluno);
		
		
	}
}
