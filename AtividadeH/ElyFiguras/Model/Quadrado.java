package Model;

public class Quadrado implements FiguraGeometrica,Comparavel {
	double lado;
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado;
		}

	@Override
	public double calcularPerimetro() {
		return this.lado * 4;
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
