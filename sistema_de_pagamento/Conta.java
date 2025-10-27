public class Conta {
    String titular;
    double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("R$ " + valor + " depositado.\n");
        this.saldoAtual();
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void transferir(double valor, Conta destino) {
        this.saldo -= valor;
        destino.saldo += valor;
        System.out.println("R$ " + valor + " transferidos para " + destino.titular);
    }

    public void saldoAtual() {
        System.out.println("Saldo atual: R$ " + this.saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
