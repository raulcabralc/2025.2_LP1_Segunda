import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();

        Scanner sc =  new Scanner(System.in);

        cb.setNumberoConta("12345");

        System.out.println("Digite o nome do titular da conta: ");
        cb.setTitular(sc.nextLine());

        System.out.println("Conta criada com sucesso!");

        cb.detalhes();

        boolean sair = false;

        while (!sair) {
            System.out.println();
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Detalhes da conta");
            System.out.println("6 - Sair");
            System.out.println();

            try {
                System.out.println("Sua escolha: ");
                int escolha = sc.nextInt();
                sc.nextLine();
                System.out.println();

                switch (escolha) {
                    case 1: {
                        System.out.println("Consulta de saldo");
                        System.out.println("=================");

                        cb.consultarSaldo();

                        break;
                    }
                    case 2: {
                        System.out.println("Sacar");
                        System.out.println("=====");

                        System.out.println("Quanto você deseja sacar?");
                        double saque =  sc.nextDouble();
                        sc.nextLine();

                        cb.sacar(saque);

                        break;
                    }
                    case 3: {
                        System.out.println("Depositar");
                        System.out.println("=========");

                        System.out.println("Quanto você deseja depositar?");
                        double deposito =  sc.nextDouble();
                        sc.nextLine();

                        cb.depositar(deposito);

                        break;
                    }
                    case 4: {
                        System.out.println("Transferir");
                        System.out.println("==========");

                        System.out.println("Quanto você deseja transferir?");
                        double transferir =  sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Para quem você quer transferir? (Número da conta)");
                        String destino = sc.nextLine();

                        cb.transferir(destino, transferir);

                        break;
                    }
                    case 5: {
                        System.out.println("Detalhes da conta");
                        System.out.println("=================");

                        cb.detalhes();
                        break;
                    }
                    case 6: {
                        System.out.println("Saindo...");
                        sair = true;
                        break;
                    }
                    default: {
                        System.out.println("Escolha inválida! Escolha com números de 1 a 6.");
                    }
                }
            } catch (Error e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}
