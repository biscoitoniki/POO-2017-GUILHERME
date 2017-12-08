package Exercicio1;

public class TesteSituacaoFinanceira {
	public static void main(String args[]) {
		SituacaoFinanceira conta = new SituacaoFinanceira(1000,500.50);
		
		System.out.println(conta.saldo());
	}
}
