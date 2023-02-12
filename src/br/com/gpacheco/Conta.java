package br.com.gpacheco;

public class Conta {
	double saldo;
	
	public boolean deposita(double valor) {
		if(this.saldo >= valor) {
			saldo += valor;
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		
		else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
	}
}
