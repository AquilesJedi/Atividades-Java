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
    Carro cl1 = new Carro();
    cl1.nome = "Corolla";
    cl1.marca = "Toyota";
    cl1.ano = 2023;
    cl1.vel = 0;
    cl1.acelerar();
    System.out.println("Velocidade: " + cl1.vel + " KM");
    cl1.freiar();
    System.out.println("Após reduzir: " + cl1.vel + " KM");
    cl1.buzinar();
    break;

case 2:
    Carro cl2 = new Carro();
    cl2.nome = "Mustang";
    cl2.marca = "Ford";
    cl2.ano = 2022;
    cl2.vel = 0;
    cl2.acelerar();
    System.out.println("Velocidade: " + cl2.vel + " KM");
    cl2.freiar();
    System.out.println("Após reduzir: " + cl2.vel + " KM");
    cl2.buzinar();
    break;

case 3:
    Carro cl3 = new Carro();
    cl3.nome = "Golf";
    cl3.marca = "Volkswagen";
    cl3.ano = 2021;
    cl3.vel = 0;
    cl3.acelerar();
    System.out.println("Velocidade: " + cl3.vel + " KM");
    cl3.freiar();
    System.out.println("Após reduzir: " + cl3.vel + " KM");
    cl3.buzinar();
    break;

case 4:
    Carro cl4 = new Carro();
    cl4.nome = "M3";
    cl4.marca = "BMW";
    cl4.ano = 2023;
    cl4.vel = 0;
    cl4.acelerar();
    System.out.println("Velocidade: " + cl4.vel + " KM");
    cl4.freiar();
    System.out.println("Após reduzir: " + cl4.vel + " KM");
    cl4.buzinar();
    break;

case 5:
    Carro cl5 = new Carro();
    cl5.nome = "C-Class";
    cl5.marca = "Mercedes-Benz";
    cl5.ano = 2022;
    cl5.vel = 0;
    cl5.acelerar();
    System.out.println("Velocidade: " + cl5.vel + " KM");
    cl5.freiar();
    System.out.println("Após reduzir: " + cl5.vel + " KM");
    cl5.buzinar();
    break;

case 6:
    Carro cl6 = new Carro();
    cl6.nome = "A4";
    cl6.marca = "Audi";
    cl6.ano = 2023;
    cl6.vel = 0;
    cl6.acelerar();
    System.out.println("Velocidade: " + cl6.vel + " KM");
    cl6.freiar();
    System.out.println("Após reduzir: " + cl6.vel + " KM");
    cl6.buzinar();
    break;

case 7:
    Carro cl7 = new Carro();
    cl7.nome = "Camaro";
    cl7.marca = "Chevrolet";
    cl7.ano = 2021;
    cl7.vel = 0;
    cl7.acelerar();
    System.out.println("Velocidade: " + cl7.vel + " KM");
    cl7.freiar();
    System.out.println("Após reduzir: " + cl7.vel + " KM");
    cl7.buzinar();
    break;

case 8:
    Carro cl8 = new Carro();
    cl8.nome = "Civic";
    cl8.marca = "Honda";
    cl8.ano = 2023;
    cl8.vel = 0;
    cl8.acelerar();
    System.out.println("Velocidade: " + cl8.vel + " KM");
    cl8.freiar();
    System.out.println("Após reduzir: " + cl8.vel + " KM");
    cl8.buzinar();
    break;

case 9:
    Carro cl9 = new Carro();
    cl9.nome = "Altima";
    cl9.marca = "Nissan";
    cl9.ano = 2022;
    cl9.vel = 0;
    cl9.acelerar();
    System.out.println("Velocidade: " + cl9.vel + " KM");
    cl9.freiar();
    System.out.println("Após reduzir: " + cl9.vel + " KM");
    cl9.buzinar();
    break;

case 10:
    Carro cl10 = new Carro();
    cl10.nome = "911";
    cl10.marca = "Porsche";
    cl10.ano = 2023;
    cl10.vel = 0;
    cl10.acelerar();
    System.out.println("Velocidade: " + cl10.vel + " KM");
    cl10.freiar();
    System.out.println("Após reduzir: " + cl10.vel + " KM");
    cl10.buzinar();
    break;                       
               }

           case 2:
               System.out.println("1-Harley;\n 2-Honda;\n 3-Yamaha;\n 4-Kawasaki;\n 5-;Suzuki\n 6-Ducati;\n 7-BMW Motorrad\n; 8-Triumph;\n 9-KTM;\n 10-Indian Motorcycles\n");
               int escolhamoto = sc.nextInt();
               switch(escolhamoto){

case 1:
    Moto mt1 = new Moto();
    mt1.nome = "Street Glide";
    mt1.marca = "Harley-Davidson";
    mt1.ano = 2023;
    mt1.vel = 0;
    mt1.acelerar();
    System.out.println("Velocidade: " + mt1.vel + " KM");
    mt1.freiar();
    System.out.println("Após reduzir: " + mt1.vel + " KM");
    mt1.buzinar();
    break;

case 2:
    Moto mt2 = new Moto();
    mt2.nome = "CB 1000R";
    mt2.marca = "Honda";
    mt2.ano = 2022;
    mt2.vel = 0;
    mt2.acelerar();
    System.out.println("Velocidade: " + mt2.vel + " KM");
    mt2.freiar();
    System.out.println("Após reduzir: " + mt2.vel + " KM");
    mt2.buzinar();
    break;

case 3:
    Moto mt3 = new Moto();
    mt3.nome = "YZF-R1";
    mt3.marca = "Yamaha";
    mt3.ano = 2023;
    mt3.vel = 0;
    mt3.acelerar();
    System.out.println("Velocidade: " + mt3.vel + " KM");
    mt3.freiar();
    System.out.println("Após reduzir: " + mt3.vel + " KM");
    mt3.buzinar();
    break;

case 4:
    Moto mt4 = new Moto();
    mt4.nome = "Ninja ZX-10R";
    mt4.marca = "Kawasaki";
    mt4.ano = 2022;
    mt4.vel = 0;
    mt4.acelerar();
    System.out.println("Velocidade: " + mt4.vel + " KM");
    mt4.freiar();
    System.out.println("Após reduzir: " + mt4.vel + " KM");
    mt4.buzinar();
    break;

case 5:
    Moto mt5 = new Moto();
    mt5.nome = "GSX-R1000";
    mt5.marca = "Suzuki";
    mt5.ano = 2021;
    mt5.vel = 0;
    mt5.acelerar();
    System.out.println("Velocidade: " + mt5.vel + " KM");
    mt5.freiar();
    System.out.println("Após reduzir: " + mt5.vel + " KM");
    mt5.buzinar();
    break;

case 6:
    Moto mt6 = new Moto();
    mt6.nome = "Panigale V4";
    mt6.marca = "Ducati";
    mt6.ano = 2023;
    mt6.vel = 0;
    mt6.acelerar();
    System.out.println("Velocidade: " + mt6.vel + " KM");
    mt6.freiar();
    System.out.println("Após reduzir: " + mt6.vel + " KM");
    mt6.buzinar();
    break;

case 7:
    Moto mt7 = new Moto();
    mt7.nome = "S1000RR";
    mt7.marca = "BMW";
    mt7.ano = 2022;
    mt7.vel = 0;
    mt7.acelerar();
    System.out.println("Velocidade: " + mt7.vel + " KM");
    mt7.freiar();
    System.out.println("Após reduzir: " + mt7.vel + " KM");
    mt7.buzinar();
    break;

case 8:
    Moto mt8 = new Moto();
    mt8.nome = "Speed Triple 1200 RS";
    mt8.marca = "Triumph";
    mt8.ano = 2023;
    mt8.vel = 0;
    mt8.acelerar();
    System.out.println("Velocidade: " + mt8.vel + " KM");
    mt8.freiar();
    System.out.println("Após reduzir: " + mt8.vel + " KM");
    mt8.buzinar();
    break;

case 9:
    Moto mt9 = new Moto();
    mt9.nome = "690 Duke";
    mt9.marca = "KTM";
    mt9.ano = 2022;
    mt9.vel = 0;
    mt9.acelerar();
    System.out.println("Velocidade: " + mt9.vel + " KM");
    mt9.freiar();
    System.out.println("Após reduzir: " + mt9.vel + " KM");
    mt9.buzinar();
    break;

case 10:
    Moto mt10 = new Moto();
    mt10.nome = "Scout Bobber";
    mt10.marca = "Indian Motorcycles";
    mt10.ano = 2021;
    mt10.vel = 0;
    mt10.acelerar();
    System.out.println("Velocidade: " + mt10.vel + " KM");
    mt10.freiar();
    System.out.println("Após reduzir: " + mt10.vel + " KM");
    mt10.buzinar();
    break;
  
               }
               
           case 3:
               System.out.println("1-Volvo;\n 2-Mercedes;\n 3-Scania;\n 4-MAN;\n 5-;DAF\n 6-Iveco;\n 7-Ford Trucks\n; 8-Mack Trucks;\n 9-Kenworth;\n 10-Freightliner\n");
               int escolhacaminhao = sc.nextInt();
               switch(escolhacaminhao){

case 1:
    Caminhao cm1 = new Caminhao();
    cm1.nome = "FH16";
    cm1.marca = "Volvo";
    cm1.ano = 2023;
    cm1.vel = 0;
    cm1.acelerar();
    System.out.println("Velocidade: " + cm1.vel + " KM");
    cm1.freiar();
    System.out.println("Após reduzir: " + cm1.vel + " KM");
    cm1.buzinar();
    break;

case 2:
    Caminhao cm2 = new Caminhao();
    cm2.nome = "Actros";
    cm2.marca = "Mercedes-Benz";
    cm2.ano = 2022;
    cm2.vel = 0;
    cm2.acelerar();
    System.out.println("Velocidade: " + cm2.vel + " KM");
    cm2.freiar();
    System.out.println("Após reduzir: " + cm2.vel + " KM");
    cm2.buzinar();
    break;

case 3:
    Caminhao cm3 = new Caminhao();
    cm3.nome = "Scania R 500";
    cm3.marca = "Scania";
    cm3.ano = 2023;
    cm3.vel = 0;
    cm3.acelerar();
    System.out.println("Velocidade: " + cm3.vel + " KM");
    cm3.freiar();
    System.out.println("Após reduzir: " + cm3.vel + " KM");
    cm3.buzinar();
    break;

case 4:
    Caminhao cm4 = new Caminhao();
    cm4.nome = "XF";
    cm4.marca = "DAF";
    cm4.ano = 2021;
    cm4.vel = 0;
    cm4.acelerar();
    System.out.println("Velocidade: " + cm4.vel + " KM");
    cm4.freiar();
    System.out.println("Após reduzir: " + cm4.vel + " KM");
    cm4.buzinar();
    break;

case 5:
    Caminhao cm5 = new Caminhao();
    cm5.nome = "Stralis";
    cm5.marca = "Iveco";
    cm5.ano = 2022;
    cm5.vel = 0;
    cm5.acelerar();
    System.out.println("Velocidade: " + cm5.vel + " KM");
    cm5.freiar();
    System.out.println("Após reduzir: " + cm5.vel + " KM");
    cm5.buzinar();
    break;

case 6:
    Caminhao cm6 = new Caminhao();
    cm6.nome = "Granite";
    cm6.marca = "Mack Trucks";
    cm6.ano = 2023;
    cm6.vel = 0;
    cm6.acelerar();
    System.out.println("Velocidade: " + cm6.vel + " KM");
    cm6.freiar();
    System.out.println("Após reduzir: " + cm6.vel + " KM");
    cm6.buzinar();
    break;

case 7:
    Caminhao cm7 = new Caminhao();
    cm7.nome = "T680";
    cm7.marca = "Kenworth";
    cm7.ano = 2022;
    cm7.vel = 0;
    cm7.acelerar();
    System.out.println("Velocidade: " + cm7.vel + " KM");
    cm7.freiar();
    System.out.println("Após reduzir: " + cm7.vel + " KM");
    cm7.buzinar();
    break;

case 8:
    Caminhao cm8 = new Caminhao();
    cm8.nome = "Cascadia";
    cm8.marca = "Freightliner";
    cm8.ano = 2023;
    cm8.vel = 0;
    cm8.acelerar();
    System.out.println("Velocidade: " + cm8.vel + " KM");
    cm8.freiar();
    System.out.println("Após reduzir: " + cm8.vel + " KM");
    cm8.buzinar();
    break;

case 9:
    Caminhao cm9 = new Caminhao();
    cm9.nome = "VNL";
    cm9.marca = "Volvo Trucks";
    cm9.ano = 2022;
    cm9.vel = 0;
    cm9.acelerar();
    System.out.println("Velocidade: " + cm9.vel + " KM");
    cm9.freiar();
    System.out.println("Após reduzir: " + cm9.vel + " KM");
    cm9.buzinar();
    break;

case 10:
    Caminhao cm10 = new Caminhao();
    cm10.nome = "Western Star 4900";
    cm10.marca = "Western Star";
    cm10.ano = 2021;
    cm10.vel = 0;
    cm10.acelerar();
    System.out.println("Velocidade: " + cm10.vel + " KM");
    cm10.freiar();
    System.out.println("Após reduzir: " + cm10.vel + " KM");
    cm10.buzinar();
    break;

               
               } 
               
       }
    }
    
}
