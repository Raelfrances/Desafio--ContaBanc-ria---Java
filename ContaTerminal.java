import java.util.Scanner;  

public class ContaTerminal{
  public static void main(String[] args){
    Scannner sc = new Scanner(System.in);

    System.out.println("Informe o número da conta:  ");
    int numeroConta = nextInt();

    System.out.println("Informe o número da Agência:  ");
    String numeroAgencia = next();

    System.out.println("Informe o nome do cliente:  ");
    String nomeCliente = nextLine();

    System.out.println("Informe o saldo inicial:  ");
    double saldoInicial = nextDouble();

    String mensagem = " Olá" + nomeCliente + ",obrigado criar uma conta em nosso banco, " + "Sua Agência é: " + numeroAgencia + ",conta: " + numeroConta +" e seu saldo inicial é de: " + saldoInicial + ", e já está disponivel para saque."; 

    System.out.println(mensagem);

    scanner.close(); 
        
    }
}