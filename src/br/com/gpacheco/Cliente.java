package br.com.gpacheco;

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNome() {            // Passa o nome do usuario!.
		return nome;
	}
	public void setNome(String nome) {       // Recebe o nome do usuario!.
		this.nome = nome;
	}
	public String getCpf() {              // Passa o CPF do usuario!.
		return cpf;
	}
	public void setCpf(String cpf) {                 // Recebe o CPF do usuario!.
		this.cpf = cpf;
	}
	public String getProfissao() {              // Passa a profissão do usuario!.
		return profissao;
	}
	public void setProfissao(String profissao) {               // Recebe a profissão do usuario!.
		this.profissao = profissao;
	}
	
	
}
