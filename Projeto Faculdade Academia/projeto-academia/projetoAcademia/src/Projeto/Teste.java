package Projeto;

public class Teste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Aluno a1 = new Aluno();
		Plano p1 = new Plano();				
		
		a1 = f1.cadastrarAluno();
		p1 = f1.cadastrarPlano();
		
		a1.imprimeDados();
		Sistema.imprimirPlano(p1);
		
	}

}