public class Produto {
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    String nome;
    double preco;
    int quantidade;

    public void exibirQuantidade() {
        System.out.println("Quantidade: " + quantidade);
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
