package lição.pkg2;

import java.util.Scanner;

public class Lição2 {

    public static double lerNotaValida(Scanner scanner, String mensagem) {
        double nota;

        while (true) {
            System.out.print(mensagem);
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                return nota;
            }

            System.out.println("Nota invalida. Digite um valor entre 0 e 10.");
        }
    }
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        char continuar;
 
        do {
            double nota1 = lerNotaValida(scanner, "Digite a primeira nota (0 a 10): ");
            double nota2 = lerNotaValida(scanner, "Digite a segunda nota (0 a 10): ");
 
            double media = (nota1 + nota2) / 2;

            System.out.printf("Media do aluno: %.2f\n", media);

            System.out.print("\nNOVO CALCULO (S/N)? ");
            continuar = scanner.next().toUpperCase().charAt(0);

        } while (continuar == 'S');{

        System.out.println("Encerrando o programa.");
    }
    }
}
