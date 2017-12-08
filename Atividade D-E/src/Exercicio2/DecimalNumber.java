package Exercicio2;

public class DecimalNumber {
	double aux;
	double parte = aux % 1;
	
	DecimalNumber(double a){
		this.aux = a;
		
	}
	
	double inteiro() {
		return this.aux - parte;
	}
	
	double decimal() {
		return this.aux % 1;
	}
}
