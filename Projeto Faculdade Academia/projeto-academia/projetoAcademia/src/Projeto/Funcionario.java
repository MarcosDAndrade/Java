package Projeto;

import java.util.Scanner;

public class Funcionario extends Pessoa implements Cadastrar {
	
	// ATRIBUTOS
	private String matriculo;
	
	// GET E SET
	public String getMatriculo() {
		return matriculo;
	}

	public void setMatriculo(String matriculo) {
		this.matriculo = matriculo;
	}
	
	// CONSTRUTOR
	Funcionario(){}
	Funcionario(String nome, String telefone, String email, String m){
		super(nome, telefone, email);
		this.matriculo = m;
	}
	
	// METODOS
	public Aluno cadastrarAluno() {
		Aluno aluno01 = new Aluno();
		
		Scanner leia = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.println("| CADASTRAR ALUNO |");
		System.out.println("-------------------");
		System.out.print("Nome: ");
		nome = leia.nextLine();
		aluno01.setNome(nome);
		System.out.print("Telefone: ");
		telefone = leia.nextLine();
		aluno01.setTelefone(telefone);
		System.out.print("Email: ");
		email = leia.nextLine();
		aluno01.setEmail(email);
		System.out.print("Ano de Nascimento: ");
		int anoNascimento = leia.nextInt();
		aluno01.setAnoNascimento(anoNascimento);
		leia.nextLine();
		System.out.print("RG: ");
		String rg = leia.nextLine();
		aluno01.setRg(rg);
		return aluno01;
	}
	
	public Plano cadastrarPlano() {
		System.out.println("-------------------");
		System.out.println("| CADASTRAR PLANO |");
		System.out.println("-------------------");
		
		Plano p1 = new Plano();
		Scanner leia = new Scanner(System.in);
		Sistema.imprimePlanosDisponiveis();
		int opc = leia.nextInt();
		
		switch (opc) {
		case 1: {
			p1.setTipoPlano("INICIANTE");
			p1.setMensalidade(90.00);
			break;
		}
		
		case 2: {
			p1.setTipoPlano("PRO");
			p1.setMensalidade(90.00);
			break;
		}
		
		case 3: {
			p1.setTipoPlano("VIP");
			p1.setMensalidade(150.00);
			break;
		}
		
		}	
		return p1;
	}
	@Override
	public void imprimeDados() {
		Sistema.imprimirInterface("FUNCIONARIO");
		System.out.println("Nome: " + this.getNome() + "\n"
							+ "Telefone: " + this.getTelefone() + "\n"
							+ "Email: " + this.getEmail() + "\n"
							+ "Matricula: " + this.getMatriculo() + "\n");
	}

	
	
}