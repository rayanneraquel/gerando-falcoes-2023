package metodo;

import javax.swing.JOptionPane;

public class TelaCalculadora {
	public static void main(String[] args) {
		String opcoes = Calculadora.mostrarOpcao();
		JOptionPane.showMessageDialog(null, opcoes);
		// System.out.println(opcoes);
		double r = Calculadora.potencia();
		JOptionPane.showMessageDialog(null, "Pot: " + r);
		// System.out.println("Pot: " + r);
		
		r = Calculadora.somar();
		JOptionPane.showMessageDialog(null, "Soma: " + r);
		System.out.println("Soma:" + r);
	}
}
