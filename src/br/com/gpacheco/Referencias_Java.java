package br.com.gpacheco;

public class Referencias_Java {
	public static void main(String args[]) {
		
		Conta primeiraConta = new Conta();                  // Instanciando uma nova referencia.
		Conta segundaConta = new Conta();
		Conta contaDoGabriel = new Conta();
		
		primeiraConta.setSaldo(400);
		segundaConta.setSaldo(300);                                         // Utilizando set para atribuir valores!.
		contaDoGabriel.setSaldo(3200);
		
		boolean valorParaDeposito = primeiraConta.deposita(50);        // Operando o deposito e criando uma condição booleana.
		if(valorParaDeposito) {                                                              // Por ser um valor booleano, ele vai permitir fazer a estrutura condicional.  
			System.out.println("Deposito realizado com sucesso!.");
			System.out.println(primeiraConta.getSaldo());
		}
		
		else {
			System.out.println("Deposito sem sucesso, tente novamente mais tarde!.");
			System.out.println(primeiraConta.getSaldo());
		}
		
		boolean valorParaSacar = primeiraConta.saca(20);               // Operando o saque e criando uma condição booleana.
		if(valorParaSacar) {
			System.out.println("Saque realizado com sucesso!.");
			System.out.println(primeiraConta.getSaldo());
		}
		
		else {
			System.out.println("Saque sem sucesso, tente novamente mais tarde!.");
			System.out.println(primeiraConta.getSaldo());
		}
		
		boolean valorParaTransferir = primeiraConta.transfere(100, segundaConta);   // Operando a transferencia, pegando a conta de destino para deposito.
		if(valorParaTransferir) {
			System.out.println("Transferencia realizada com sucesso!.");
			System.out.println(primeiraConta.getSaldo());
			System.out.println(segundaConta.getSaldo());
		}
		
		else {
			System.out.println("Transferencia sem sucesso, tente novamente mais tarde!.");
			System.out.println(primeiraConta.getSaldo());                                    // utilizando get para me encaminhar valores.
			System.out.println(segundaConta.getSaldo());
		}
		
	}
}
