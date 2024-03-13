package br.com.fiap.ddd.model;

public class Exercicio {
	
	private String descricao;
	private int series;
	private int repeticoes;
	private String observacao;
	
	
	public Exercicio(String descricao, int series, int repeticoes, String observacao) {
		super();
		this.descricao = descricao;
		this.series = series;
		this.repeticoes = repeticoes;
		this.observacao = observacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getSeries() {
		return series;
	}
	public void setSeries(int series) {
		this.series = series;
	}
	public int getRepeticoes() {
		return repeticoes;
	}
	public void setRepeticoes(int repeticoes) {
		this.repeticoes = repeticoes;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	

}
