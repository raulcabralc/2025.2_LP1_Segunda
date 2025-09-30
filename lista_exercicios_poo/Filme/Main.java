import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do filme: ");
        filme.setNome(sc.nextLine());

        System.out.println("Digite o gênero do filme: ");
        filme.setGenero(sc.nextLine());

        System.out.println("Digite o ano do filme: ");
        filme.setAno(sc.nextInt());
        sc.nextLine();

        System.out.println("Digite a duração do filme (em minutos): ");
        filme.setDuracao(sc.nextInt());
        sc.nextLine();

        System.out.println("Digite sua avaliação do filme (0-10): ");
        filme.avaliar(sc.nextInt());
        sc.nextLine();

        filme.calcularMediaAvaliacoes();

        System.out.println("Filme cadastrado!");

        filme.exibirDetalhes();

        sc.close();
    }
}
