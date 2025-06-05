package exerciciocarro;

public class Carro {
    
    String nome;
    String marca;
    int ano;
    int vel;
    
    public void acelerar(int aceleracao){
        this.vel+=20;
    }
    
    public void freiar(int reduzir){
        this.vel-=10;
        if (this.vel < 0) {
            this.vel = 0;
        }
    }
    
    public void buzinar(){
        System.out.println("Carro Buzinando!");
    }
}
