package model;

public class ContaCorrente implements Conta,Tributavel {
	protected double saldo;
        
    public void saca(double valor) {
        this.saldo -= valor;
        }
    
    public double getSaldo() {
        return this.saldo;
        }
    
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }
    
    @Override
    public void deposita(double valor) {
        this.saldo += valor - 0.10;
        }

	@Override
	public double getValorImposto() {
		return	this.getSaldo()	*	0.01;
	}
}