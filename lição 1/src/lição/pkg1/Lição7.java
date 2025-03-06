package lição.pkg1;

import java.util.Scanner;

public class Lição7 {
    public static void main(String[] args) {
        System.out.println("Qual a Distancia que será percorrida?");
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        System.out.println("Qual o consumo médio?");
        Scanner sc2 = new Scanner(System.in);
        int consumo = sc.nextInt();
        System.out.println("Qual o preço do combustivel?");
        Scanner sc3 = new Scanner(System.in);
        int preco = sc.nextInt();
        
        int custo = distancia / consumo * preco;
        System.out.println("O custo será:");
        System.out.println(custo);
    }
}
