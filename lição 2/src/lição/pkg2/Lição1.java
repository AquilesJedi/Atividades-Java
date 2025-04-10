
package lição.pkg2;


import java.util.Scanner;

public class Lição1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        double primeiroValor;
        double segundoValor;

        while (true) {
            System.out.print("Digite o primeiro valor: ");
            primeiroValor = scanner.nextDouble();

            if (primeiroValor != 0) {
                break;
            }

            System.out.println("O primeiro valor nao pode ser zero. Tente novamente.");
        }

        while (true) {
            System.out.print("Digite o segundo valor: ");
            segundoValor = scanner.nextDouble();

            if (segundoValor != 0) {
                break;
            }

            System.out.println("O segundo valor nao pode ser zero. Tente novamente.");
        }

        double resultado = primeiroValor / segundoValor;

        System.out.printf("\n Resultado da divisao: %.2f / %.2f = %.2f\n",primeiroValor, segundoValor, resultado);


    }
}


