package exercicios.aulasPoo.aulaSete;

public class ContaBancaria {

    private int numero;
    private String tipo;
    private double saldo;
    private double limite;

    public ContaBancaria(int numero, String tipo, double limite) {
        this.numero = numero;
        this.tipo = tipo;
        this.limite = limite;
    }
    public ContaBancaria(){}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite, double saldo) {
        this.limite = 2*this.saldo;
    }

    public void realizarDeposito(double valor){
        this.saldo +=valor;
    }

    public boolean realizarSaque(double valor){
        if (this.getSaldo() >= valor + limite) {
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
    public double saldoDisponivel(){
        return saldo;
    }
}
