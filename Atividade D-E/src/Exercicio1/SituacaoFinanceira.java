package Exercicio1;

public class SituacaoFinanceira {
	double valorCreditos;
	double valorDebitos;
	
	SituacaoFinanceira(double credito, double debito){
		this.valorCreditos = credito;
		this.valorDebitos = debito;
	}
	
	double saldo() {
		double resultado = valorCreditos - valorDebitos;
		return resultado;
	}
}
