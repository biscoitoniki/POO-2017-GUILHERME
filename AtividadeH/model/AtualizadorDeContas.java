package model;

public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    
    public AtualizadorDeContas(double selic) {
        this.selic = selic;
        }
    
    
    public double getSaldoTotal(){
        return saldoTotal;
    }
    
    private void somatotal(double valor){
        saldoTotal += saldoTotal + valor;
    }
    
    public String roda(Conta c) {
        double novosaldo = c.getSaldo() + selic;
        double antigosaldo = c.getSaldo();
        somatotal(novosaldo);
        return "Saldo Antigo: " + antigosaldo
                + "/nNovo Saldo: " + novosaldo;
        }


}
