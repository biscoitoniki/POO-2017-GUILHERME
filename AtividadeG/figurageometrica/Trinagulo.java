package figurageometrica;

public class Trinagulo extends FiguraGeometrica {
	double base;
	double altura;
	double lado1;
	double lado2;
	
	void setLado1(double lado){
		this.lado1 = lado;
	}
	
	void setLado2(double lado){
		this.lado2 = lado;
	}
	
	void setBase(double lado){
		this.base = lado;
	}
	
	void calcularArea() {
		this.area = this.base * this.altura;
		
	}
	void calcularPerimetro() {
		this.perimetro = this.base + this.lado1 + this.lado2;
		
	}
	
}
