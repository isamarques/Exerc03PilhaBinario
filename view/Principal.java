package view;
import controller.ConverteController;
import model.PilhaInt;
import javax.swing.*;


public class Principal {

	public static void main(String[] args) throws Exception {
		PilhaInt pilha = new PilhaInt();
		ConverteController converte = new ConverteController();
		
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
			
			String resto = converte.decToBin(valor, pilha);
			System.out.println("==================");
			System.out.println("O binário de " +valor+ " é " +resto);
	}
}