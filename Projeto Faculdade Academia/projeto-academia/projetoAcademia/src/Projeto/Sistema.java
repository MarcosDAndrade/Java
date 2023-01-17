package Projeto;

public class Sistema {

	
	public static void imprimirPlano(Plano plano) {
		imprimirInterface("PLANO");
		System.out.println("PLANO " + plano.getTipoPlano() + "\n"
							+ "MENSALIDADE: R$" + plano.getMensalidade());
	}
	
	public static void imprimirInterface(String tipoPessoa) {
		System.out.println("------------------");
		System.out.println("| DADOS DO " + tipoPessoa +" |");
		System.out.println("------------------");	
	}
	
	
	public static void imprimePlanosDisponiveis() {
		System.out.print("[1] PLANO INICIANTE: MUSCULAÇÃO (R$90,00) " + "\n"
							+ "[2] PLANO PRO: MUSCULAÇÃO + 2 AULAS (R$120,00)" + "\n"
							+ "[3] PLANO VIP: MUSCULAÇÃO + TODAS AULAS (R$150,00)" + "\n"
							+ "SELECIONE O NÚMERO DO PLANO: ");
		
	}
	
	
}
