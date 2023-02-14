package br.com.gpacheco;
/**
 * 
 * @author Gustavo de Almeida Pacheco
 * Static é passado como um atributo compartilhado dentro do construtor/objeto Conta. (Onde vai ser contado a cada criação de um objeto, um novo +1.)
 * Declarando o atributo saldo, em private para ocular o saldo para usuario não autorizado.
 */

public class Conta {          // ---------------------------------------- Criando o objeto Conta...
	private double saldo;                                         
	private int agencia;
	private int numero;
	private Cliente titular;  // ---------------------------------------- Direcionando as contas, para o Objeto Cliente.
	private static int total;                       
	
	/**
	 * Metodo de construção inicializado.
	 * Agora é obrigatorio a passagem de agencia e conta (nos parametros de criação), para se criar um novo objeto com informações nescessarias.
	 * Conta.total soma a quantidade de contas criadas em uma classe.
	 * @param agencia é feito no modelo construtor.
	 * @param numero é feito no modelo construtor.
	 */
	
	public Conta(int agencia, int numero) {               
		this.agencia = agencia;                                 
		this.numero = numero;
		System.out.println("Criado a agencia: " + agencia + ", e criado o numero de conta: " + numero + "\n");
		Conta.total++;                                                                                          
		System.out.println("O numero total de contas criadas e: " + Conta.total + "\n");
	}
	
	/**
	 * Passando o parametro "valor" do tipo Double para identificar o tipo de parametro para classe principal, o booleano é para dar o retorno de sucesso ou falha!.
	 * 
	 * @param valor
	 * @return verdadeiro ou falso.
	 */
	
	public boolean deposita(double valor) {                       
		if(this.saldo >= valor) {  // --------------------------------------- Condição para ser efetuado o deposito.
			saldo += valor;
			return true; // ------------------------------------------------- Retorna para classe principal a informação que deu tudo certo!.
		}
		
		else {
			return false;   // ---------------------------------------------- Retorna para classe principal a informação de que a operação foi cancelada!.
		}
	}
	
	/**
	 * Passando o parametro "valor" do tipo Double para identificar o tipo de parametro para classe principal, o booleano é para dar o retorno de sucesso ou falha!
	 * @param valor
	 * @return verdadeiro ou falso.
	 */
	public boolean saca(double valor) {                     
		if(this.saldo >= valor) {  // --------------------------------------- Condição para ser efetuado o saque.
			this.saldo -= valor;
			return true;   // ----------------------------------------------- Retorna para classe principal a informação que deu tudo certo!.
		} 
		
		else {
			return false;  // ----------------------------------------------- Retorna para classe principal a informação de que a operação foi cancelada!.
		}
	}
	
	/**
	 * Passando os parametros valor e conta para classe principal, e o retorno delas é booleano.
	 * Me utilizando de metodos prontos para simplificar meu codigo, pois a operação é igual.
	 * Me utilizando de metodos prontos para simplificar meu codigo, pois a operação é igual e destino é a conta destino do deposito.
	 * @param valor
	 * @param destino
	 * @return
	 */
	
	public boolean transfere(double valor, Conta destino) {       
		if(this.saldo >= valor) {  // ---------------------------------------- Condição para ser efetuada a transferencia.
			this.saca(valor);                                               
			destino.deposita(valor);                                           
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Passa o saldo do usuario!.
	 * @return double
	 */
	
	public double getSaldo() {                    
		return this.saldo;
	}
	
	/**
	 * Recebe o saldo do usuario, para conta titular.
	 * @param valor
	 */
	
	public void setSaldo(double valor) {             
		this.saldo = valor;
	}
	
	/**
	 * *** Recebe os dados do 1° titular de forma separada, o parametro é o proprio cliente e, seu comportamento é de incluir em conta.titular os dados da referencia gabriel com seus setters. ***
	 * @param gabriel
	 */
	
	public void setTitular1(Cliente gabriel) {           
		this.titular = gabriel;
	}
	
	public void setTitular2(Cliente maria) {           
		this.titular = maria;
	}
	
	public void setTitular3(Cliente rodrigo) {           
		this.titular = rodrigo;
		
	}
	
	/**
	 * Passa as informações do titular de forma separada.
	 * @return Objeto @see_Cliente.java
	 */
	
	public Cliente getTitular() {                                
		return this.titular;
	}
	
	/**
	 * getTotal() faz com que as outras classes recebam o numero total de contas.
	 * @return static int
	 */
	
	public static int getTotal() {                         
		return Conta.total;
	}
}
