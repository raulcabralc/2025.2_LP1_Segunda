import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        Scanner sc =  new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        p1.setNome(sc.nextLine());

        System.out.println("Digite o preço do produto: ");
        p1.setPreco(sc.nextDouble());
        sc.nextLine();

        System.out.println("Digite o quantidade do produto: ");
        p1.setQuantidade(sc.nextInt());
        sc.nextLine();

        p1.calcularValorTotal();
        p1.exibirDetalhes();

        sc.close();
    }
}
