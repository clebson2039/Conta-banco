import java.util.Scanner;
//Preciso desse comentário para atualizar

public class ContaTerminal {

    Scanner scan = new Scanner(System.in);

    /*public void solicitarNome() {
        System.out.println("Nome completo: ");
        String nome = scan.nextLine();
        System.out.println("Olá " + nome);
    }

    public void solicitarAgencia() {
        System.out.println("Agencia: ");
        String agencia = scan.nextLine();
        System.out.println("obrigado por criar uma conta em nosso banco, sua agência é: " + agencia);
    }

    public void solicitarConta() {
        System.out.println("Número da conta: ");
        String conta = scan.nextLine();
        System.out.println("conta: " + conta);
    }

    public void solicitarSaldo() {
        System.out.println("Adicione seu saldo: ");
        double saldoConta = scan.nextDouble();
        System.out.println("e seu saldo: " + saldoConta + "já está disponível para saque");
    }*/

    public void solicitandoDados() {

        System.out.println("Nome completo: ");
        String nome = scan.nextLine();

        System.out.println("Agencia: ");
        String agencia = scan.nextLine();

        System.out.println("Número da conta: ");
        int conta = scan.nextInt();

        System.out.println("Adicione seu saldo: ");
        double saldoConta = scan.nextDouble();


        if (nome == ""){
            System.out.println("Digite seu nome");
        }else if(agencia == ""){
            System.out.println("Digite sua agência");
        }else if(conta < 0) {
            System.out.println("Digite sua conta");
        }else if(saldoConta < 0.0){
            System.out.println("Digite seu saldo");
        }
        System.out.println(":---------------------------------------------------:");
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. \nSua agência é: " + agencia + "\nConta: " + conta + "\nE seu saldo: " + saldoConta + ", já está disponível para saque.");
    }
}