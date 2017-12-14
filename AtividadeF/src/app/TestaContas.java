package app;
import model.*;

public class TestaContas {
    
    public static void main(String[] args) {
           
        
        /*Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();*/
        
        
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        //System.out.println(c.getSaldo());
        //System.out.println(cc.getSaldo());
        //System.out.println(cp.getSaldo());
        
        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
        
        
        
       
        /*Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        
        System.out.println("Saldo Total: " + adc.getSaldoTotal());
*/
    }
}