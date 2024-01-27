package desafio;

import java.util.Random;
import java.util.Scanner;

public class GreenFalcon {

	static int altura = 8;
	static int comprimento = 8;
	static int posicaoX = 0;
	static int posicaoY = 0;
	static Scanner sc = new Scanner(System.in);

	public static void renderizarTela() {
		for(int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				if(posicaoX == j && posicaoY == i) {
					System.out.print("P");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}		
	}

	public static void menu() {
		System.out.println("0. Sair");
		System.out.println("1. Renderizar");
		System.out.println("2. Move");
		System.out.println("3. Cima");
		System.out.println("4. Baixo");
		System.out.println("5. Esquerda");
		System.out.println("6. Direita");
		System.out.println("7. Verificar se está no limite");
	}

	public static void mover() {
		System.out.println("Informe quanto vc quer movimentar");
		posicaoX += sc.nextInt();
		System.out.println("Nova posicao X: " + posicaoX);
	}

	public static void moverParaCima() {
		posicaoY++;
		System.out.println("Nova posicao Y:" + posicaoY);
	}

	public static void moverParaBaixo() {
		posicaoY++;
		System.out.println("Nova posicao Y:" + posicaoY);
	}

	public static void moverParaEsquerda() {
		posicaoX++;
		System.out.println("Nova posicao X:" + posicaoX);
	}

	public static void moverParaDireita() {
		posicaoX++;
		System.out.println("Nova posicao X:" + posicaoX);
	}

	public static boolean isAtEdge() {
		if(posicaoY == 0) {
			return true;
		} else {
			if(posicaoY == altura - 1) {
				return true;
			} else {
				if(posicaoX == 0) {
					return true;
				} else {
					if(posicaoX == comprimento - 1) {
						return true;
					} else {
						return false;
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Green Falcon!!!");
		System.out.println("Renderizando mundo 8x8");

		renderizarTela();

		int comando;
		do {
			menu();
			comando = sc.nextInt();

			switch (comando) {
			case 0:
				System.out.println("Saindo");
				break;

			case 1:
				renderizarTela();
				break;

			case 2:
				mover();
				break;

			case 3:
				moverParaCima();
				break;

			case 4:
				moverParaBaixo();
				break;

			case 5:
				moverParaEsquerda();
				break;

			case 6:
				moverParaDireita();
				break;

			case 7:
				if(isAtEdge()) {
					posicaoX = 0;
					posicaoY = 0;
					renderizarTela();
				}
				break;

			default:
				System.out.println("Valor invalido:" + comando);
			}

		} while (comando !=0);
		sc.close();
	}
}


