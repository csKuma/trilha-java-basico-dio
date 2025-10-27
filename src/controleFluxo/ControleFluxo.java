package src.controleFluxo;

import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o primeiro valor");
        var valor1 = sc.nextInt();
        System.out.println("insira o segundo valor");
        var valor2 = sc.nextInt();
        sc.nextDouble();
        validarValores(valor1, valor2);
        imprimirValores(valor1, valor2);
    }

    private static void imprimirValores(int valor1, int valor2) {
        var diferenca = Math.abs(valor1 - valor2);
        System.out.println(String.format("a diferenca entre os valores é %d", diferenca));
        System.out.println("Imprimindo valores");
        for (int i = 1; i <= diferenca; i++) {
            System.out.println(i);
        }
    }

    private static void validarValores(int valor1, int valor2) throws Exception {
        if (valor1 >= valor2) {
            String mensagem = String.format("parametro2: %d é menor ou igual ao parametro2: %d ,tente novamente passando valores validos", valor1, valor2);
            throw new ValoresInvalidosExeption(mensagem);
        }
    }


}
