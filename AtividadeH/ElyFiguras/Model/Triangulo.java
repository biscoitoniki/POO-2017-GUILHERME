package Model;

public class Triangulo implements FiguraGeometrica,Comparavel {
	double altura;
	double base;
	double lado2;
	double lado3;
	
	public Triangulo(double altura, double base, double lado2, double lado3) {
		super();
		this.altura = altura;
		this.base = base;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double calcularArea() {
		return (this.base * this.altura) / 2;
		}

	@Override
	public double calcularPerimetro() {
		return this.lado2 + this.lado3 + this.base;	
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
