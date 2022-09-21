package aulaDois;

public class ContaBancaria {

    double numeroConta;
    String tipoConta;
    double saldo;
    double quantia;

    public void deposito(double quantia) {
        saldo = saldo + quantia;
    }
    
    public void saque(double quantia) {
        if (quantia <= saldo) {
            saldo = saldo - quantia;
        }
    }
}
