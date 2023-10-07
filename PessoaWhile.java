
public class PessoaWhile {
	
	public static void main(String[]args) {
		int repeticoes = 5;
		int cont = 0;
		
		while(cont < repeticoes) {
			System.out.println("batendo na mesa");
			System.out.println("Posição atual: " + cont);
			cont = cont + 1;
		}
	}
}