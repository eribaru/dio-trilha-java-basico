package src;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US).useDelimiter("\n");
    System.out.println("Por favor, digite o nome do cliente !");
    String nomeCliente = scanner.next();
    System.out.println("Por favor, digite o número da Agência !");
    String agencia = scanner.next();
    System.out.println("Por favor, digite o número da conta !");
    int numero = scanner.nextInt();
    System.out.println("Por favor, digite o saldo da conta !");
    double saldo = scanner.nextDouble();

    System.out.println(String.format(
        "Olá %s obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f%n já está disponível para saque",
        nomeCliente, agencia, numero, saldo));
    scanner.close();
  }
}
