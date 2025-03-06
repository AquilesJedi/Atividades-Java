package lição.pkg1;

import java.util.Scanner;

public class Lição9 {
    public static void main(String[] args) {
        System.out.println("Qual sua Idade?");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        int mes = idade * 12;
        int dia = idade * 365;
        System.out.println("Sua Idade em Meses é:");
        System.out.println(mes);
        System.out.println("Sua Idade em Dias é:");
        System.out.println(dia);
    }
}
