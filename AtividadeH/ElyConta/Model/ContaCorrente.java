package Model;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(String nome, double saldo) {
		super(nome, saldo);
	}

	@Override
	public double calculaTributo() {
		double tributos = super.saldo * 0.1;
		return tributos;
	}
}
