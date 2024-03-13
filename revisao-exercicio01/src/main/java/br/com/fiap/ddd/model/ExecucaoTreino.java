package br.com.fiap.ddd.model;

import java.time.LocalDate;

public class ExecucaoTreino {

	private LocalDate data;
	private Treino treino;
	
	public ExecucaoTreino(Treino treino) {
		super();
		this.data = LocalDate.now();
		this.treino = treino;
	}

	public LocalDate getData() {
		return data;
	}

	public Treino getTreino() {
		return treino;
	}
	
	
	
	
	
}
