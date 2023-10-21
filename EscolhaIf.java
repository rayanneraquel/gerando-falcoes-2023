
public class EscolhaIf {
	public static void main(String[] args) {
		double n1 = 12;
		double n2 = 22;		
		char simbolo = '+';
		double calculo = 0;
		
		if (simbolo == '+') {		
			calculo = n1+n2;
		}
		else if (simbolo == '-') {		
			calculo = n1-n2;
		}
		else if (simbolo == '*') {		
			calculo = n1*n2;
		}
		else if (simbolo == '/') {		
			calculo = n1/n2;
		}
		else {		
			System.err.println("Simbolo invalido");
		}
		System.out.println(calculo);
	}
}
