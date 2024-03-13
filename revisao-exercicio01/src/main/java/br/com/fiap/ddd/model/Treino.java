package br.com.fiap.ddd.model;

import java.util.ArrayList;
import java.util.List;

public class Treino {
	private Long id;
	private String nome;
	private List<Exercicio> exercicios = new ArrayList<>();
	private String observacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Exercicio> getExercicios() {
		return exercicios;
	}
	public void setExercicios(List<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public void adicionarExercicio(Exercicio exercicio) {
		this.exercicios.add(exercicio);
		
	}
	
	

}
