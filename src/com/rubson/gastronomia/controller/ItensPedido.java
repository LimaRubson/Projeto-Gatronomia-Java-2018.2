package com.rubson.gastronomia.controller;

public class ItensPedido {
	
	private int quantidadePrato;
	private Prato prato;
	private double valorTotal;
	private int quantidadeItensPedidos;
	
	public ItensPedido(int quantidadePrato, Prato prato, double valorTotal, int quantidadeItensPedidos) {
		super();
		this.quantidadePrato = quantidadePrato;
		this.prato = prato;
		this.valorTotal = valorTotal;
		this.quantidadeItensPedidos = quantidadeItensPedidos;
	}
	
	public ItensPedido() {
		this.quantidadePrato = 0;
		this.prato = null;
		this.valorTotal = 0;
		this.quantidadeItensPedidos = 0;
	}

	public int getQuantidadePrato() {
		return quantidadePrato;
	}

	public void setQuantidadePrato(int quantidadePrato) {
		this.quantidadePrato = quantidadePrato;
	}

	public Prato getPrato() {
		return prato;
	}

	public void setPrato(Prato prato) {
		this.prato = prato;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getQuantidadeItensPedidos() {
		return quantidadeItensPedidos;
	}

	public void setQuantidadeItensPedidos(int quantidadeItensPedidos) {
		this.quantidadeItensPedidos = quantidadeItensPedidos;
	}
	

	@Override
	public String toString() {
		return "ItensPedidos [quantidadePrato=" + quantidadePrato + ", prato=" + prato + ", valorTotal=" + valorTotal
				+ ", quantidadeItensPedidos=" + quantidadeItensPedidos + "]";
	}

}
