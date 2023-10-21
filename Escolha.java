import java.util.Scanner;

public class Escolha {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero");
		double n1 = sc.nextDouble();
		System.out.println("Entre com o segundo numero");
		double n2 = sc.nextDouble();	
		System.out.println("Entre com o simbolo");
		char simbolo = sc.next().charAt(0);
		double calculo = 0;
		sc.close();

		switch (simbolo) {
		case '+':
			calculo = n1+n2;
			break;
		case '-':
			calculo = n1-n2;
			break;
		case '*':
			calculo = n1*n2;
			break;
		case '/':
			calculo = n1/n2;
			break;

		}
		System.out.println(calculo);
	}
}
