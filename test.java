import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Idade do aluno: ");
        int idade = sc.nextInt();
        sc.nextLine();

        Aluno a1 = new Aluno(nome, idade);

        System.out.println("Matrícula do aluno: ");
        a1.setMatricula(sc.nextLine());

        System.out.println("Nota 1 do aluno: ");
        a1.setN1(sc.nextDouble());

        System.out.println("Nota 2 do aluno: ");
        a1.setN2(sc.nextDouble());

        System.out.println("Nota 3 do aluno: ");
        a1.setN3(sc.nextDouble());

        a1.calcularMedia();

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
                String.format(" | Média: %.2f", a1.getMedia())
                );

        sc.close();
    }
}
