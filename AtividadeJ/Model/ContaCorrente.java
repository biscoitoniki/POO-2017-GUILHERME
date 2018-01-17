package Model;

public class ContaCorrente {

	protected int saldo;

	public void sacar(double valor){
		if(valor < 0){
			throw	new	IllegalArgumentException("Voc�	tentou	sacar	um	valor	negativo");}
		if	(this.saldo < valor){
			throw	new	SaldoInsuficienteException(valor);
		}
		this.saldo	-=	(valor	+	0.10);
		} 

	public int getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		if(valor < 0){
			throw	new	IllegalArgumentException("Voc� tentou depositar um valor negativo");
			}
		else{
			this.saldo	+=	valor;}	
	}
}