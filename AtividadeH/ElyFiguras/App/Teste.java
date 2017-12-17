package App;

import Model.Circulo;
import Model.Quadrado;

public class Teste {
	public static void main(String[] args) {
		Quadrado f1 = new Quadrado(2);
		Circulo f2 = new Circulo(4);
		
		System.out.println(f2.comparar(f1));
	
	}
}
