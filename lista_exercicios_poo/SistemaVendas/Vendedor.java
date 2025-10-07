public class Vendedor {
    String nome;
    String matricula;

    public void emitirPedido(String pedidoId) {
        System.out.printf("Pedido %s emitido com sucesso!", pedidoId);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
