package App;

import Model.AuditoriaInterna;
import Model.ContaCorrente;
import Model.SeguroDeVida;

public class Teste {
	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente("Lucas", 200);
		ContaCorrente conta2 = new ContaCorrente("Maria", 300);
		ContaCorrente conta3 = new ContaCorrente("Jorge", 400);
		ContaCorrente conta4 = new ContaCorrente("Carlos", 500);
		ContaCorrente conta5 = new ContaCorrente("Matheus", 600);
		SeguroDeVida s1 = new SeguroDeVida();
		SeguroDeVida s2 = new SeguroDeVida();
		SeguroDeVida s3 = new SeguroDeVida();
		SeguroDeVida s4 = new SeguroDeVida();
		SeguroDeVida s5 = new SeguroDeVida();
		
		AuditoriaInterna lista = new AuditoriaInterna(5);
		lista.adicionar(s1);
		lista.adicionar(s2);
		lista.adicionar(s3);
		lista.adicionar(s4);
		lista.adicionar(s5);
		lista.adicionar(conta1);
		lista.adicionar(conta2);
		lista.adicionar(conta3);
		lista.adicionar(conta4);
		lista.adicionar(conta5);
		
		System.out.println(lista.calcularTributos());
	}
}
