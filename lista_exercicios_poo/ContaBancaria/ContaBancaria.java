public class ContaBancaria {
    private double saldo = 0;
    private String numberoConta;
    private String titular;

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public void depositar(double valor) {
        saldo += valor;

        System.out.println("Depósito realizado!");
        System.out.println("Saldo atual: " + saldo);
    }

    public void sacar(double valor) {
        if (saldo <= 0 || saldo < valor) {
            System.out.println("Saldo insuficiente.");
            System.out.println("Saldo atual: " + saldo);
            return;
        }

        saldo -= valor;

        System.out.println("Saque realizado!");
        System.out.println("Saldo atual: " + saldo);
    }

    public void transferir(String destinoNumero, double valor) {
        saldo -= valor;

        ContaBancaria destino = new ContaBancaria();
        destino.numberoConta = numberoConta;
        destino.saldo += valor;

        System.out.println("Transferência realizada!");
        System.out.println("Saldo atual: " + saldo);
    }

    public void detalhes() {
        System.out.println("Número da conta: " + numberoConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: " + saldo);
    }

    /// GET & SET

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumberoConta() {
        return numberoConta;
    }

    public void setNumberoConta(String numberoConta) {
        this.numberoConta = numberoConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
