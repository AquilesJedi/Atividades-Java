package exerciciocarro;
import java.util.Scanner;

public class ExercicioCarro {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         
       System.out.println("1 Carro");
       System.out.println("2 Moto");
       System.out.println("3 Caminhão");
       
       int escolher = sc.nextInt();
       
       switch(escolher){
           
           case 1:
               System.out.println("1-Toyota;\n 2-Ford;\n 3-Volkswagen;\n 4-BMW;\n 5-Mercedes;\n 6-Audi;\n 7-Chevrolet;\n 8-Honda;\n 9-Nissan;\n 10-Porsche;\n");
               int escolhacarro = sc.nextInt();
               switch(escolhacarro){
               
                   case 1:
                       Carro c1 = new Carro();
                       c1.nome = "Corolla";
                       c1.marca = "Toyota";
                       c1.ano = 2023;
                       c1.vel = 0;
                       c1.acelerar();
                       System.out.println("Velocidade "+c1.vel+" KM");
                       c1.freiar();
                       System.out.println("Apos Reduzir "+c1.vel+" KM");
                       c1.buzinar();
                       break;

                   case 2:
                       Carro c2 = new Carro();
                       c2.nome = "Mustang";
                       c2.marca = "Ford";
                       c2.ano = 2022;
                       c2.vel = 0;
                       c2.acelerar();
                       System.out.println("Velocidade "+c2.vel+" KM");
                       c2.freiar();
                       System.out.println("Apos Reduzir "+c2.vel+" KM");
                       c2.buzinar();
                       break;
                       
               }

           case 2:
               System.out.println("1-Harley;\n 2-Honda;\n 3-Yamaha;\n 4-Kawasaki;\n 5-;Suzuki\n 6-Ducati;\n 7-BMW Motorrad\n; 8-Triumph;\n 9-KTM;\n 10-Indian Motorcycles\n");
               int escolhamoto = sc.nextInt();
               switch(escolhamoto){
               
               
               }
               
           case 3:
               System.out.println("1-Volvo;\n 2-Mercedes;\n 3-Scania;\n 4-MAN;\n 5-;DAF\n 6-Iveco;\n 7-Ford Trucks\n; 8-Mack Trucks;\n 9-Kenworth;\n 10-Freightliner\n");
               int escolhacaminhao = sc.nextInt();
               switch(escolhacaminhao){
               
               
               } 
               
       }
    }
    
}
