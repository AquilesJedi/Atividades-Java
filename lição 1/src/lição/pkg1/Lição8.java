package lição.pkg1;

import java.util.Scanner;

public class Lição8 {
    public static void main(String[] args) {
        System.out.println("Diga um valor:");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        
        int resultado = valor - 1;
        
        System.out.println("O Antecessor desse valor é:");
        System.out.println(resultado);
    }
}