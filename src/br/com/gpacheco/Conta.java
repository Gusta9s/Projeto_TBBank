package br.com.gpacheco;

public class Conta {                                  // Criando o objeto Conta...
	private double saldo;                                          // Declarando o atributo saldo, em private para ocular o saldo para usuario não autorizado.
	private int agencia;
	private int numero;
	private Cliente titular;                                            // Direcionando as contas, para o Objeto Cliente.
	private static int total;                                   // Static é passado como um atributo compartilhado dentro do construtor/objeto Conta. (Onde vai ser contado a cada criação de um objeto, um novo +1.)
	
	public Conta(int agencia, int numero) {               // Metodo de construção inicializado.
		this.agencia = agencia;                                 // Agora é obrigatorio a passagem de agencia e conta (nos parametros de criação), para se criar um novo objeto com informações nescessarias.
		this.numero = numero;
		System.out.println("Criado a agencia: " + agencia + ", e criado o numero de conta: " + numero + "\n");
		Conta.total++;                                                                                           // Conta.total soma a quantidade de contas criadas em uma classe.
		System.out.println("O numero total de contas criadas e: " + Conta.total + "\n");
	}
	
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
	
	public double getSaldo() {                    // Passa o saldo do usuario!.
		return this.saldo;
	}
	
	public void setSaldo(double valor) {             // Recebe o saldo do usuario, para conta titular.
		this.saldo = valor;
	}
	
	public void setTitular1(Cliente gabriel) {           // *** Recebe os dados do 1° titular de forma separada, o parametro é o proprio cliente e, seu comportamento é de incluir em conta.titular os dados da referencia gabriel com seus setters. ***
		this.titular = gabriel;
	}
	
	public void setTitular2(Cliente maria) {              // || //
		this.titular = maria;
	}
	
	public void setTitular3(Cliente rodrigo) {            // || //
		this.titular = rodrigo;
		
	}
	
	public Cliente getTitular() {                                // Passa as informações do titular de forma separada.
		return this.titular;
	}
	
	public static int getTotal() {                         // getTotal() faz com que as outras classes recebam o numero total de contas.
		return Conta.total;
	}
}
