
import java.util.Scanner;

public class SistemaCompra {

	static Scanner sc = new Scanner(System.in);

	static String[] nome = new String[100];
	static double[] preco = new double[100];
	static long[] quantidadeEstoque = new long[100];
	static String[] codigoBarras = new String[100];

	static int quantidadeCadastrada = 0;
	static int opcao;


	public static void menuInicial() {
		System.out.println("O que você deseja fazer?");
		System.out.println("1 - Cadastrar Novo Produto");
		System.out.println("2 - Visualizar Produtos");
		System.out.println("3 - Vender");
		System.out.println("0 - Sair");
		opcao = sc.nextInt();		
	}

	public static void cadastroProduto() {
		System.out.println("===================CADASTRO PRODUTO===================");
		System.out.println("Informe o nome do produto:");
		sc.nextLine();
		nome[quantidadeCadastrada] = sc.nextLine();
		System.out.println("Informe o preço:");
		preco[quantidadeCadastrada] = sc.nextDouble();
		sc.nextLine();
		System.out.println("Informe a quantidade no estoque:");
		quantidadeEstoque[quantidadeCadastrada] = sc.nextLong();
		System.out.println("Código de barras");
		sc.nextLine();
		codigoBarras[quantidadeCadastrada++] = sc.nextLine();
		System.out.println("======================================================");
	}

	public static void visualizarProduto() {
		System.out.println("===================VISUALIZAR PRODUTOS===================");
		System.out.print("Produto.................:");
		System.out.print("Preço...................:");
		System.out.print("Estoque.................:");
		System.out.print("Código..................:");
		System.out.println("\n======================================================");	
		if (quantidadeCadastrada > 0) {
			String space = "                         |";
			for (int i = 0; i < quantidadeCadastrada; i++) {
				System.out.print(nome[i] + space);
				System.out.print(preco[i] + space);
				System.out.print(quantidadeEstoque[i] + space);
				System.out.println(codigoBarras[i] + space);
			}
		} else {
			System.out.println("Nao ha produto cadastrado");
		}
		System.out.println("\n======================================================");	
	}

	public static void menuCaixa() {

		char opcaoCaixa = 'E';
		System.out.println("===================CAIXA===================");
		double total = 0;
		do {
			System.out.print("E - Encerrrar.......:");
			System.out.print("R - Registrar.......:");
			System.out.println("T - Totalizar.......:");
			opcaoCaixa = sc.next().charAt(0);
			switch (opcaoCaixa) {
			case 'E':
			case 'e':
				System.out.println("Compra finalizada");
				break;
			case 'R':
			case 'r':
				System.out.println("Informe o código de barras");
				sc.nextLine();
				String codigoBarraCompra = sc.nextLine();
				if (quantidadeCadastrada > 0) {
					String space = "                         |";
					for (int i = 0; i < quantidadeCadastrada; i++) {
						if (codigoBarras[i].equals(codigoBarraCompra)) {
							String name = nome[i] + space;
							String price = preco[i] + space;
							String stock = quantidadeEstoque[i] + space;
							String ean = codigoBarras[i] + space;
							System.out.print(name.substring(0, 25));
							System.out.print(price.substring(0, 25));
							System.out.print(stock.substring(0, 25));
							System.out.print(ean.substring(0, 25));
							total += preco[i];
						} else {
							System.out.println("Produto nao encontrado na base de dados");
						}
					}
				} else {
					System.out.println("Nao ha produto cadastrado");
				}
				break;
			case 'T':
			case 't':
				System.out.println("Compra no valor " + total);
				break;
			default:
				System.out.println("Opcao caixa : " + opcaoCaixa + " Invalido");
			}
			System.out.println("\n======================================================");
		} while (opcaoCaixa != 'e');
	}

	public static void opcaoSair() {
		System.out.println("Obrigado por usar o sistema GF Store");
	}

	public static void main(String[] args) {

		System.out.println("Olá, Welcome to GF Store");

		do {
			menuInicial();

			switch (opcao) {
			case 0:
				opcaoSair();
				break;
			case 1:
				cadastroProduto();
				break;
			case 2:
				visualizarProduto();
				break;
			case 3:
				menuCaixa();
				break;
			default:
				System.out.println("Opcao invalida: " + opcao);
			}
		} while (opcao != 0);
		sc.close();
	}
}
