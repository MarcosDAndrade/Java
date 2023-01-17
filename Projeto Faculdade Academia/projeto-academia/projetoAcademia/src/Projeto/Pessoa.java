package Projeto;

import java.time.LocalDate;

public abstract class Pessoa {
	// ATRIBUTOS
	protected String nome;
	protected String telefone;
	protected String email;
	
	// GET E SET	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// CONSTRUTORES
	Pessoa(){}
	Pessoa(String n, String t, String e){
		nome = n;
		telefone = t;
		email = e;
	}
	
	// METODOS
	public void imprimeDados() { }
	
	public int calcularIdade(int anoNascimento) {
		
		if(anoNascimento == 0) {
			return 0;
		}
		
		int idade = LocalDate.now().getYear() - anoNascimento;
		
		return idade;		
		
	}
	
}