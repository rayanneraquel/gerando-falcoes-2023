import java.util.Scanner;

public class LeitorArquivo {
	
	public class Filme {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe a quantidade de pessoas");
			int quantidadeAtores = sc.nextInt();
			sc.nextLine();
			String atores[] = new String[quantidadeAtores];
			for (int i = 0; i < quantidadeAtores; i++) {
				System.out.println("Informe o nome do Ator/Atriz");
				atores[i] = sc.nextLine();
			}
			System.out.println(atores[2]);
			sc.close();
		}
	}

}
