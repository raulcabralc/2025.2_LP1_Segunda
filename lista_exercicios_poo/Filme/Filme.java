public class Filme {
    String nome;
    String genero;
    int ano;
    int duracao;
    double somaNotas = 0;
    double mediaNotas;
    int qtdAvaliacoes;

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println("Duração (em minutos): " + duracao);
        System.out.println("Média da notas: " + mediaNotas);
        System.out.println("Quantidade de avaliações: " + qtdAvaliacoes);
    }

    public void avaliar(int nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("A nota deve ser entre 0 e 10.");
        } else {
            somaNotas += nota;
            qtdAvaliacoes++;
            System.out.println("Avaliação cadastrada. Nota enviada: " + somaNotas);
        }
    }

    public double calcularMediaAvaliacoes() {
        return mediaNotas = somaNotas / qtdAvaliacoes;
    }

    ///  GET & SET

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getSomaNotas() {
        return somaNotas;
    }

    public void setSomaNotas(double somaNotas) {
        this.somaNotas = somaNotas;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public int getQtdAvaliacoes() {
        return qtdAvaliacoes;
    }

    public void setQtdAvaliacoes(int qtdAvaliacoes) {
        this.qtdAvaliacoes = qtdAvaliacoes;
    }
}
