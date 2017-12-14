package figurageometrica;

public class Quadrado extends FiguraGeometrica{
	double lado;
	
	void setLado(double lado){
		this.lado = lado;
	}

	void calcularArea() {
		this.area = this.lado * this.lado;
	}

	void calcularPerimetro() {
		this.perimetro = this.lado +this.lado +this.lado +this.lado;
	}



}
