import interfaces.Modalidade;
import interfaces.Pagamento;

public class Corrente extends Conta implements Pagamento {
    public Corrente(String titular, double valor) {
        super(titular, valor);
    }

    @Override
    public void processarPagamento(double valor, Modalidade modalidade) {
        double limite = 0;

        if (modalidade.equals(Modalidade.PIX)) {
            limite = 5000;
        } else if (modalidade.equals(Modalidade.CARTAO)) {
            limite = 20000;
        } else if (modalidade.equals(Modalidade.BOLETO)) {
            if (valor < 0) {
                System.out.println("Valor precisa ser maior que 0");
            }
        }

        if (valor > limite) {
            System.out.println("Valor (" + valor + ") ultrapassou o limite (" + limite + ")");
            return;
        }

        this.saldo -= valor;
    }
}
