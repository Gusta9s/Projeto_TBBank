package br.com.gpacheco;

public class Referencias_Java {
	public static void main(String args[]) {
		
		Conta primeiraconta = new Conta();
		Conta segundaconta = new Conta();
		
		primeiraconta.saldo = 400;
		segundaconta.saldo = 300;
		
		boolean valorParaDeposito = primeiraconta.deposita(50);
		if(valorParaDeposito) {
			System.out.println("Deposito realizado com sucesso!.");
			System.out.println(primeiraconta.saldo);
		}
		
		else {
			System.out.println("Deposito sem sucesso, tente novamente mais tarde!.");
			System.out.println(primeiraconta.saldo);
		}
		
		boolean valorParaSacar = primeiraconta.saca(20);
		if(valorParaSacar) {
			System.out.println("Saque realizado com sucesso!.");
			System.out.println(primeiraconta.saldo);
		}
		
		else {
			System.out.println("Saque sem sucesso, tente novamente mais tarde!.");
			System.out.println(primeiraconta.saldo);
		}
		
		boolean valorParaTransferir = primeiraconta.transfere(100, segundaconta);
		if(valorParaTransferir) {
			System.out.println("Transferencia realizada com sucesso!.");
			System.out.println(primeiraconta.saldo);
			System.out.println(segundaconta.saldo);
		}
		
		else {
			System.out.println("Transferencia sem sucesso, tente novamente mais tarde!.");
			System.out.println(primeiraconta.saldo);
			System.out.println(segundaconta.saldo);
		}
		
	}
}
