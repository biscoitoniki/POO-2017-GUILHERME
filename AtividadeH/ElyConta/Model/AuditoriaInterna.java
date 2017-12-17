package Model;

public class AuditoriaInterna {
	private Tributavel[] tributaveis;
	private int contador = 0;
	
	public AuditoriaInterna(int valor) {
		this.tributaveis = new Tributavel[valor];
	}
	
	public double calcularTributos() {
		double valorTributos = 0;
		for(int i = 0; i <= contador; i++) {
			valorTributos += tributaveis[i].calculaTributo();
			}
		return valorTributos;
	}
	
	public void adicionar(Tributavel tributo) {
		this.tributaveis[contador] = tributo;
		contador += 1;
	}
}
