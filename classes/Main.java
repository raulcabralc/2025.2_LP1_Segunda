import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Idade do aluno: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Matrícula do aluno: ");
        String matricula = sc.nextLine();

        System.out.println("Nota 1 do aluno: ");
        double n1 = (sc.nextDouble());

        System.out.println("Nota 2 do aluno: ");
        double n2 = (sc.nextDouble());

        System.out.println("Nota 3 do aluno: ");
        double n3 = (sc.nextDouble());

        Aluno a1 = new Aluno(nome, idade, matricula, n1, n2, n3);

        a1.calcularMedia();
        a1.setCargo(Cargo.Aluno);

        if (a1.getMedia() >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Nome: " + a1.getNome() +
                " | Idade: " + a1.getIdade() +
                " | Matrícula: " + a1.getMatricula() +
                " | Nota 1: " + a1.getN1() +
                " | Nota 2: " + a1.getN2() +
                " | Nota 3: " + a1.getN3() +
                String.format(" | Média: %.2f", a1.getMedia()) +
                " | Cargo: " + a1.getCargo()
        );

        sc.close();
    }
}
