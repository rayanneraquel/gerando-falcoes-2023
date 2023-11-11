package exercicio;

import java.util.Scanner;

public class Desafio1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá Ana. Vamos começar a calcular suas despesas desse mês");
		System.out.println("Qual o mês que estamos calculando?");
		String mes = sc.nextLine();

		System.out.println("Quantas despesas vc fez em " + mes+ "?");
		int despesas = sc.nextInt();

		int d2 = 0;		
		int i = 0;
		while (i < despesas){
			i++;
			System.out.println("Insira o valor da despesa " +i+ ": ");
			int d = sc.nextInt();	
			d2 = d2 + d;			
		}

		System.out.println("Agora Ana, me diz quanto vc ganhou esse mês");
		int salario = sc.nextInt();

		int resultado;		

		if (d2>salario) {
			resultado =  d2 - salario;
			System.out.println("E agora Ana? Ainda faltam " +resultado+ " reais.");
		} else {
			resultado =  salario - d2;
			System.out.println("Que bom Ana! Você vai pagar todas as despesas e ainda vai sobrar " +resultado+ " reais.");
		} 


		sc.close();
	}
}
