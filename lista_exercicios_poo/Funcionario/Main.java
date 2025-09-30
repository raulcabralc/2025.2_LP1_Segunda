import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        f1.setNome(sc.nextLine());

        System.out.println("Digite o salario do funcionario: ");
        f1.setSalarioBruto(sc.nextDouble());
        sc.nextLine();

        System.out.println("Digite a matrícula do funcionario: ");
        f1.setMatricula(sc.nextLine());

        sc.close();

        System.out.println(f1.exibirContracheque());
    }
}
