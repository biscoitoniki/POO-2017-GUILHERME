package Model;

public class Circulo implements FiguraGeometrica,Comparavel {
	double raio;
	double pi = 3.14;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return pi * this.raio * this.raio;
		
	}

	@Override
	public double calcularPerimetro() {
		return 2 * pi * raio;
		
	}

	@Override
	public int comparar(FiguraGeometrica figura) {
		if (this.calcularArea() > figura.calcularArea()) {
			return 1;
		}
		if (this.calcularArea() < figura.calcularArea()) {
			return -1;
		}
		return 0;
	}

}
