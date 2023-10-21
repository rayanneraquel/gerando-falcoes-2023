import java.util.Scanner;

public class FalcFlix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double opcao = 0;
		
		System.out.println("Escolha uma opcao: ");
		System.out.println("Bem vindo ao FalcFlix!!!");
		System.out.println("===========================");
		System.out.println(" ");
		System.out.println("Cadastrar Filme");
		System.out.println("Cadastrar Usuario");
		System.out.println("Cadastrar Forma de Pagamento");
		System.out.println("Pesquisar Filme");
		System.out.println("Ver Top 10");
		System.out.println("Favoritar");
		System.out.println("Sair");
		System.out.println(" ");
		int opcoes = sc.nextInt();	

		
		switch (opcoes) {
		case (1): 
			System.out.println("cadastrar filme");		    
			break;
		case (2):
			System.out.println("cadastrar filme");		    
			break;
		case (3):
			System.out.println("cadastrar filme");		    
			break;
		case (4):
			System.out.println("cadastrar filme");		    
			break;	
			return 
		}
	}
}
