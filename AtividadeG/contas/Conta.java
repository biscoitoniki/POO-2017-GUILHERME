package contas;

public abstract class Conta{
    
    protected double saldo;
    
    public abstract void deposita(double valor);
        
    public abstract void saca(double valor);
    
    public double getSaldo() {
        return this.saldo;
        }
    
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
        }
    
}