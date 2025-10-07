public class Cliente {
    private String nome;
    private String cpf;

    public void fazerPedido(String produtoId) {
        System.out.printf("Pedido do produto %s feito.", produtoId);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
