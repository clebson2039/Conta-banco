import java.util.Scanner;

public class ContaTerminal {

    
    public static void main(String[] args) {
        
       
       Scanner scan = new Scanner(System.in);

       System.out.println("Nome completo: ");
       String nome = scan.nextLine();
       System.out.println("Agencia: ");
       String agencia = scan.nextLine();
       System.out.println("Número da conta: ");
       int numeroConta = scan.nextInt();
       System.out.println("Adicione seu saldo: ");
       double saldovalor = scan.nextDouble();
       
       System.out.println(":----------------------------------------------------------------------:");
       System.out.println("Olá " + nome + "\nObrigado por criar uma conta em nosso banco, sua agencia é: " + agencia + "\nSua conta: " + numeroConta + "\ne seu saldo é de: " + saldovalor + ", já está disponível para saque.");
    }
}