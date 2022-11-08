package java.exercicios.revista;

import java.util.*;

public class Revista {
	
	private int codigo;
	private String titulo;
	private int reciclagemProduzida;
	private Edicao edicao;
	
	public Edicao getEdicao() {
		return edicao;
	}
	public void setEdicao(Edicao edicao) {
		this.edicao = edicao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getReciclagemProduzida() {
		return reciclagemProduzida;
	}
	public void setReciclagemProduzida(int reciclagemProduzida) {
		this.reciclagemProduzida = reciclagemProduzida;
	}
	
	
	
	public void adicionarEdicao(int nr, Date dt, int trg, int qv) {
		this.edicao.setNumero(nr);
		this.edicao.setDt(dt);
		this.edicao.setTriagem(trg);
		this.edicao.setQtdeVendida(qv);
		
	}
	
	public void removerEdicao(Edicao edicao) {
		
	}
	public void acumularReciclagem(int qtdeReciclada) {
	
	}
	
	
	
}
