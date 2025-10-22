import java.util.Scanner;

/*
    desafio DIO trilha java basico
    receber campos usa
    A tributo	Tipo	Exemplo
    Numero	Inteiro	1021
    Agencia	Texto	067-8
    Nome Cliente	Texto	MARIO ANDRADE
    Saldo	Decimal	237.48
e retornar a mensagem
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco DIO!");
        System.out.println("informe os dados a seguir");
        System.out.println("nome: ");
        var nome = sc.nextLine();
        System.out.println("informe o numero");
        var numero = sc.nextInt();
        sc.nextLine();
        System.out.println("informe a agencia");
        var agencia = sc.nextLine();
        System.out.println("informe o saldo");
        var saldo = sc.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco," +
                " sua agência é %s, conta %d e seu saldo %f já está disponível para saque", nome, agencia, numero, saldo));


    }
}