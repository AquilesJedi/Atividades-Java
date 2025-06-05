package exerciciocarro;

public class Moto {
    
    String nome;
    String marca;
    int ano;
    int vel;
    
    void acelerar(int aceleracao){
        this.vel+=20;
    }
    
    void freiar(int reduzir){
        this.vel-=10;
        if (this.vel < 0) {
            this.vel = 0;
        }
    }
    
    void buzinar(){
        System.out.println("Moto Buzinando!");
    }
}
