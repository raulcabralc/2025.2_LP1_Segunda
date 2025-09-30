public class Pessoa {
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    protected String nome;
    protected int idade;

    public void aniversario() {
        idade++;
        System.out.println("Nova idade: " + idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
