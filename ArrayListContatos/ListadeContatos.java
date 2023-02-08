package ArrayListContatos;

import java.util.ArrayList;
import java.util.Scanner;

import Arraylist.Usuario;

public class ListadeContatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean rodando = true;
		ArrayList <Contatos> c = new ArrayList<>();	
		System.out.println("--------------------");
		System.out.println(" AGENDA DE CONTATOS");
		System.out.println("--------------------");
		
		
		
		do {
			System.out.println("1- Adicionar Contato");
			System.out.println("2- Mostrar Contatos");
			System.out.println("3- Buscar Contato");
			System.out.println("4- Editar Contato");
			System.out.println("5- Remover Contato");
			System.out.println("6- Sair");
			
			String opc = sc.nextLine();
			
			
			switch (opc){		
			case "1":{
				System.out.println("Digite o nome: ");				
				String nome = sc.nextLine();
				System.out.println("Digite o número: ");
				String tel = sc.nextLine();				
				Contatos c1 = new Contatos();
				c1.setNome(nome);
				c1.setTel(tel);
				
				c.add(c1);
				break;
			}
			case "2": {
				for(int i=0;i<c.size();i++) {
					Contatos uTemp = c.get(i);
					System.out.println("");
					System.out.println("Contato: " + (i+1));
					System.out.printf("\tNome: %s%n"  , c.get(i).getNome());
					System.out.printf("\tTelefone: %s%n"  , c.get(i).getTel());
					System.out.println("======================");
				}
				break;
				
			}
			case "3": {				
				System.out.println("===== PROCURAR CONTATO =====");
				
				System.out.println("Digite o nome do contato:");
				String Nome = sc.nextLine();
				
				boolean encontrado = false;
				for (int i=0;i<c.size();i++) {
					Contatos uTemp = c.get(i);								
					if(Nome.equals(uTemp.getNome())) {
						System.out.println("RESULTADO: ");
						System.out.println("======================");
						System.out.println("Nome: " + uTemp.getNome());
						System.out.println("Telefone: " + uTemp.getTel());
						System.out.println("======================");
						encontrado = true;
						break;
					}
			} 
				if(!encontrado) {
						System.out.println("Contato não encontrado!");
				}
			}break;
			case "4": {
				System.out.println("===== EDITAR CONTATO =====");
				
				for (int i=0; i<c.size();i++) {
					
					Contatos uTemp = c.get(i);
					
					System.out.println("["+(i+1)+"]"+ uTemp.getNome());
					
				}
				
				System.out.println("Selecione o contato: ");
				int referencia = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Digite o novo nome: ");
				String nomenovo = sc.nextLine();
				System.out.println("Digite o novo número: ");
				String telnovo = sc.nextLine();
				
				Contatos c1 = c.get(referencia-1);
				c1.setNome(nomenovo);
				c1.setTel(telnovo);
				break;				
				
			}
			case "5": {
				
				
				System.out.println("===== REMOVER CONTATO =====");
				
			
				for (int i=0; i<c.size();i++) {
					
					Contatos uTemp = c.get(i);
					
					System.out.println("["+(i+1)+"]"+ uTemp.getNome());
									
				}

				System.out.println("Selecione o contato: ");
				int referencia = sc.nextInt();
				sc.nextLine();
				
				c.remove(referencia-1);
				
				System.out.println("Removido com Sucesso!");
				
				break;
				}
			}
		}while(rodando == true);
		sc.close();

	}
}
