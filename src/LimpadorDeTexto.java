import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LimpadorDeTexto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, eu sou o limpador de texto!!!");
		System.out.println("Onde está o arquivo texto que devo limpar?");
		String arquivo = sc.nextLine();
		System.out.println("Muito bom, entendi. O arquivo está em: " + arquivo);
		System.out.println("Qual o nome do arquivo texto que devo limpar?");
		String nomeArquivo = sc.nextLine();
		System.out.println("Certo. O arquivo é: " + nomeArquivo + ".txt");
		//		System.out.println("Agora me informe quantas palavras devo limpar dentro do arquivo.");
		//		int qtdLimpar = sc.nextInt();
		//		sc.nextLine();	
		//		System.out.println("Certo. Agora me infome o que devo limpar dentro do arquivo: ");
		//		String[] limpar = new String[qtdLimpar];
		//		for (int i = 0; i < qtdLimpar; i++) {
		//			limpar[i] = sc.nextLine();	
		//		}
		//		System.out.println("Boa, já tenho tudo que preciso");
		//		System.out.println("Irei limpar " + qtdLimpar + " 'palavras' e elas são: ");
		//		for (int i = 0; i < qtdLimpar; i++) {
		//			System.out.println("Palavra " + i + ": " + limpar[i]);	
		//		}
		//
		//		System.out.println("Vou iniciar a limpeza (Vou criar um arquivo no mesmo local com o nome " + nomeArquivo + "_limpo.txt");
		//		System.out.println("Terminei. Dá uma olhada lá");
		//		
		File novoArquivo = new File(arquivo + nomeArquivo + ".txt");
		System.out.println("Criando arquivo em: " + arquivo + nomeArquivo + ".txt");

		try {
			novoArquivo.createNewFile();
			System.out.print(novoArquivo);

		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}
}
