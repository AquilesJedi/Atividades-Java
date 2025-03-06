package lição.pkg1;

public class Lição3 {
    public static void main(String[] args) {
    String vendedor = "Rodrigo";
    int salariofix = 2000;
    int vendas = 200;
    int comissão = (100*vendas)/15;
    int salario = comissão+salariofix;
    
    System.out.println("Vendedor: "+vendedor);
    System.out.println("Salário Fixo: "+salariofix);
    System.out.println("Salário + Comissão: "+salario);
    }
}
