package java.exercicios.revista;

import java.util.Date;

public class Edicao {

	private int numero;
	private Date dt;
	private int triagem;
	private int qtdeVendida;
	private boolean reciclou;
	
	public int getQtdeVendida() {
		return qtdeVendida;
	}
	public void setQtdeVendida(int qtdeVendida) {
		this.qtdeVendida = qtdeVendida;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getDt() {
		return dt;
	}
	public void setDt(Date dt) {
		this.dt = dt;
	}
	public int getTriagem() {
		return triagem;
	}
	public void setTriagem(int triagem) {
		this.triagem = triagem;
	}
	public boolean isReciclou() {
		return reciclou;
	}
	public void setReciclou(boolean reciclou) {
		this.reciclou = reciclou;
	}
	
	public boolean reciclarExemplares() {
		
		return reciclou;
	}
}
