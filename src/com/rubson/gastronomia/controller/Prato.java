package com.rubson.gastronomia.controller;

public class Prato {

	private int id;
	private String nome;
	private String ingredientes;
	
	
	public Prato(int id, String nome, String ingredientes) {
		super();
		this.id = id;
		this.nome = nome;
		this.ingredientes = ingredientes;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Prato [id=" + id + ", nome=" + nome + ", ingredientes=" + ingredientes + "]";
	}
	
}
