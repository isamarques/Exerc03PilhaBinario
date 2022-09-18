package controller;
import model.PilhaInt;

public class ConverteController {

	public ConverteController() {
		super();
	}
	
	PilhaInt pilhaint = new PilhaInt();
	
	public String decToBin (int valor, PilhaInt pilha) throws Exception{
		
		if (valor == 0) {
			return "";
		}
		
		int resto = valor % 2;
		valor = valor / 2;
		pilha.push(resto);
		
		if (pilha.size() > 0) {
		String concatena = Integer.toString(pilha.pop());
		concatena = concatena + "";
		System.out.println(concatena + " ");
		}
		
		return decToBin(valor, pilha) + resto;
	}
}
