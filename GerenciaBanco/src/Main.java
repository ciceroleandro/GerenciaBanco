import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Sistema Gerencia Banco!");

        //Criar uma conta
        System.out.print("Informe um nome por favor: ");
        String nome = scanner.nextLine();
        System.out.print("Informe um sobrenome por favor: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Informe um cpf por favor: ");
        String cpf = scanner.nextLine();

        //Instanciando um objeto da classe Cliente
        Cliente cliente = new Cliente (nome, sobrenome, cpf);

        boolean continuar = true;

        //Menu de opções
        while (true){
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");


            int escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    cliente.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Informe o valor a ser depositado.");
                    double valorDeposito = scanner.nextDouble();
                    cliente.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Informe o valor a ser sacado.");
                    double valorSaque = scanner.nextDouble();
                    cliente.sacar(valorSaque);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Obrigado por utilizar nosso sistema. Até logo!");
                    System.exit(0);
                default:
                    System.out.println("Opção invalida. Por favor tente novamente!");

            }
        }




    }

}
