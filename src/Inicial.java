import java.util.*;

public class Inicial {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Caixa Eletronico em JAVA");

        int tentativas = 3;
        double saldo = 999.12;

        while (tentativas > 0) {

            System.out.print("\nInforme sua senha: ");
            int senha = sc.nextInt();

            if (senha == 1234) {

                System.out.print("Escolha uma das opcoes:\n1. Saldo\n2. Saque\n3. Deposito\n4. Sair");
                try {
                    System.out.print("\nEscolha uma opcao: ");


                } catch (Exception e) {

                    System.out.print("Houve um erro. Por favor, escolha uma opcao entre 1, 2, 3 e 4");
                    System.out.print("Erro: " + e);
                }

                int opcao = sc.nextInt();
                if (opcao == 1) {
                    System.out.print("\nSeu saldo é de: R$ " + saldo);
                } else if (opcao == 2) {

                    System.out.print("\nSeu saldo e de: R$" + saldo);
                    System.out.print("\nInforme o valor para retirada: ");
                    double retirada = sc.nextDouble();

                    if (retirada > 0 && retirada < saldo) {
                        saldo = saldo - retirada;
                        System.out.print("\nO saldo na sua conta e de: " + saldo);

                    } else if (retirada > saldo) {
                        System.out.print("\nNao ha saldo suficiente na conta.");
                    } else {
                        System.out.print("\nSua conta nao foi movimentada.");
                    }

                } else if (opcao == 3) {
                    System.out.print("\nPor favor, informe o valor para deposito: ");

                    double deposito = sc.nextDouble();
                    saldo = saldo + deposito;

                    System.out.print("\nSeu saldo e de " + saldo);

                } else if (opcao == 4) {
                    System.out.print("\nObrigado por utilizar o nosso Banco");
                    System.exit(0);

                } else {
                    System.out.print("\nOpcao invalida ");
                }

            } else {
                System.out.print("Senha invalida\n");
                tentativas -= 1;

                if (tentativas > 0) {
                    System.out.print("\nVoce possui " + tentativas + " tentativa(s)");
                } else {
                    System.out.print("\nSeu acesso foi bloqueado.");
                    sc.close();
                }
            }
        }

        System.out.print("\nPor favor, contate o seu gerente.");
        sc.close();

    }
}
