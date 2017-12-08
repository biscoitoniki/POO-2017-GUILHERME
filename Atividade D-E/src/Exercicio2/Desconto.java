package Exercicio2;

public class Desconto {
	double valorConta;
	double desconto;
	
	Desconto(double a, double b){
		this.valorConta = a;
		this.desconto = b;
	}
	double calcula() {
		double resultado = valorConta - (valorConta * desconto/100);
		return resultado;
	}
}
