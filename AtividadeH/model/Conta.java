package model;

public interface Conta{
    
    public void deposita(double valor);
        
    public void saca(double valor);
    
    public double getSaldo();
    
    public void atualiza(double taxa);
    
}
