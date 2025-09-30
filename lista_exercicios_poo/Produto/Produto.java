public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + " | Preço: " + preco + " | Quantidade: " + quantidade);
    }

    public void calcularValorTotal() {
        System.out.println("Valor total (preço x quantidade): " + preco * quantidade);
    }

    ///  GET & SET

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
