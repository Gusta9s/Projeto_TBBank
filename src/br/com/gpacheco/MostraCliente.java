package br.com.gpacheco;

public class MostraCliente {

	public static void main(String args[]) {
		
		Cliente gabriel = new Cliente();
		Cliente maria = new Cliente();                                      // Instanciando as referencias (com os dados dos (clientes/titulares); atributos referentes a dados do titular, porem, complementando as informações do Objeto Conta.
		Cliente rodrigo = new Cliente();
		
		gabriel.setNome("Gabriel Alcantara");
		gabriel.setCpf("782.190.522-32");                               //Passando os valores de cada referencia, em seus determinados setters.
		gabriel.setProfissao("Entregador");
		
		maria.setNome("Maria de Jesus Silva");
		maria.setCpf("341.818.571-18");
		maria.setProfissao("Costureira");
		
		rodrigo.setNome("Rodrigo Delorft Damasceno"); 
		rodrigo.setCpf("189.188.785-93");
		rodrigo.setProfissao("Cozinheiro");
		
		Conta contaDoGabriel = new Conta(2981,53415);                               // Instanciando no Objeto Conta, as contas de cada usuario...
		Conta contaDaMaria = new Conta(9095, 16232);                                   // Agora se tornou obrigatorio, a passagem de parametros conforme foi solicitado no construtor!.
		Conta contaDoRodrigo = new Conta(4671, 83438);
		
		System.out.println(Conta.getTotal());                                // Passando o total de contas, atraves do metodo getTotal()...
		
		contaDoGabriel.setTitular1(gabriel);                                        // Fazendo a composição das contas, direcionando-os para o Objeto Cliente para receber suas determinadas atribuições em cima dos setters. EX: = setTitular1 vai receber os dados de gabriel.
		contaDaMaria.setTitular2(maria);
		contaDoRodrigo.setTitular3(rodrigo);
		
		System.out.println(contaDoGabriel.getTitular().getNome() + "\n" + contaDoGabriel.getTitular().getCpf() + "\n" + contaDoGabriel.getTitular().getProfissao() + "\n");
		System.out.println(contaDaMaria.getTitular().getNome() + "\n" + contaDaMaria.getTitular().getCpf() + "\n" + contaDaMaria.getTitular().getProfissao() + "\n");
		System.out.println(contaDoRodrigo.getTitular().getNome() + "\n" + contaDoRodrigo.getTitular().getCpf() + "\n" + contaDoRodrigo.getTitular().getProfissao());
	}
}
