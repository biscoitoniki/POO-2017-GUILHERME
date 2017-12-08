package Exercicio1;
public class Circulo {
		double raio;
		
		Circulo(double raio){
			this.raio = raio;
		}
		
		double calcularArea() {
			double area = 3.14 * raio * raio;
			return area;
		}
		
		double calcularPerimetro() {
			double perimetro = 3.14 * 2 * raio;
			return perimetro;
		}
	}