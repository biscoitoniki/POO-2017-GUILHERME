package contas;

public class ContaPoupanca extends ContaCorrente {
       
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
        }
}