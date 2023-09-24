import java.util.Scanner;

public class CTAtividadePratica2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe o numero da conta: ");
        int numero = sc.nextInt();

        Conta contaA = new Conta(nome, numero);
        
        System.out.println("\n Informe: \n (1) para depositar \n (2) para sacar \n (0) para sair ");
        int choose = sc.nextInt();

        while (choose != 0){
            
            switch (choose) {
                case 1:
                    System.out.println("Informe o valor que deseja depositar na conta: ");
                    float valor = sc.nextInt();
                    contaA.depositar(valor);
                    System.out.printf("\n O saldo da conta eh: R$%.2f reais \n", contaA.getSaldo());
                    break;

                case 2:
                    System.out.println("Informe o valor que deseja sacar da conta: ");
                    valor = sc.nextFloat();
 
                    if (contaA.sacar(valor)){
                        System.out.printf("\n Saque realizado com sucesso \n");
                        System.out.printf("\n O saldo da conta eh: R$%.2f reais \n", contaA.getSaldo());
                    } else {
                        System.out.printf("\n Saque não efetuado \n");
                    }
                    break;

                case 0:
                    break;     
            }

            System.out.println("\n Informe: \n (1)  para depositar \n (2) para sacar \n (0) para sair: ");
            choose = sc.nextInt();
        }
    }
}