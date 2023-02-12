package br.com.gpacheco;

public class Conta {                                  // Criando o objeto Conta...
	double saldo;                                          // Declarando o atributo saldo.
	
	public boolean deposita(double valor) {                       // Passando o parametro "valor" do tipo Double para identificar o tipo de parametro para classe principal, o booleano é para dar o retorno de sucesso ou falha!. 
		if(this.saldo >= valor) {                       // Condição para ser efetuado o deposito.
			saldo += valor;
			return true;                            // Retorna para classe principal a informação que deu tudo certo!.
		}
		
		else {
			return false;                           // Retorna para classe principal a informação de que a operação foi cancelada!.
		}
	}
	
	public boolean saca(double valor) {                     // Passando o parametro "valor" do tipo Double para identificar o tipo de parametro para classe principal, o booleano é para dar o retorno de sucesso ou falha!
		if(this.saldo >= valor) {                       // Condição para ser efetuado o saque.
			this.saldo -= valor;
			return true;                                        // Retorna para classe principal a informação que deu tudo certo!.
		} 
		
		else {
			return false;                                      // Retorna para classe principal a informação de que a operação foi cancelada!.
		}
	}
	
	public boolean transfere(double valor, Conta destino) {       // Passando os parametros valor e conta para classe principal, e o retorno delas é booleano.
		if(this.saldo >= valor) {                                       // Condição para ser efetuada a transferencia.
			this.saca(valor);                                               // Me utilizando de metodos prontos para simplificar meu codigo, pois a operação é igual.
			destino.deposita(valor);                                           // Me utilizando de metodos prontos para simplificar meu codigo, pois a operação é igual e destino é a conta destino do deposito.
			return true;
		}
		else {
			return false;
		}
	}
}
