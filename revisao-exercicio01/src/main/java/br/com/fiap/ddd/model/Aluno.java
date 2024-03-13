package br.com.fiap.ddd.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String matricula;
	private String nome;
	private List<Treino> treinos = new ArrayList<Treino>();
	private List<ExecucaoTreino> execucoes = new ArrayList<ExecucaoTreino>();
	
	public Aluno(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Treino> getTreinos() {
		return treinos;
	}

	public void setTreinos(List<Treino> treinos) {
		this.treinos = treinos;
	}

	public List<ExecucaoTreino> getExecucoes() {
		return execucoes;
	}

	public void setExecucoes(List<ExecucaoTreino> execucoes) {
		this.execucoes = execucoes;
	}
	
	
	public void adicionarTreino(Treino treino) {
		this.treinos.add(treino);
	}
	
	public Treino getTreinoAtual() {
		
		if(this.treinos.isEmpty()) {
			throw new AlunoSemTreinoCadastradoException("Não existem treinos para este aluno");
		}
		
		return this.treinos.get(this.treinos.size() -1);
	}
	
	public void registrarExecucao() {
		Treino treinoAtual = this.getTreinoAtual();
		
		ExecucaoTreino novaExecucao = new ExecucaoTreino(treinoAtual);
		
		for(ExecucaoTreino execucaoExistente : this.execucoes) {
			
			if (execucaoExistente.getData().equals(novaExecucao.getData())) {
				throw new AlunoJaRealizouTreinoNaDataException("Ja existe treino para a data atual");
			}
			
		this.execucoes.add(novaExecucao);
		
		}
		
	}

}
