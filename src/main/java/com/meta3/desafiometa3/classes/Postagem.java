package com.meta3.desafiometa3.classes;

public class Postagem {
	
	private String conteudo;
	private String data;
	public Postagem(String conteudo, String data) {
		super();
		this.conteudo = conteudo;
		this.data = data;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	

}
