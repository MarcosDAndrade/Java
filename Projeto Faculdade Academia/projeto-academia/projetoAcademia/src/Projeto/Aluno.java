package Projeto;

import java.util.Scanner;

public class Aluno extends Pessoa{
	// ATRIBUTOS
	private int anoNascimento;
	private String rg;
	
	// GET E SET
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	// CONSTRUTORES
	Aluno(){}
	
	Aluno(String nome, String telefone, String email, int an, String rg){
		super(nome, telefone, email);
		this.anoNascimento = an;
		this.rg = rg;
	}
	
	// METODOS
	@Override
	public void imprimeDados() {
		Sistema.imprimirInterface("ALUNO");
		System.out.println("Nome: " + this.getNome() + "\n"
							+ "Telefone: " + this.getTelefone() + "\n"
							+ "Email: " + this.getEmail() + "\n"
							+ "Ano Nascimento: " + this.getAnoNascimento() + "\n"
							+ "RG: " + this.getRg() + "\n"
							+ "Idade: " + calcularIdade(this.getAnoNascimento()));
	}
	

	}

