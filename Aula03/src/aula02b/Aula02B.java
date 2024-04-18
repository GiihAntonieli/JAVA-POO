
package aula02b;

public class Aula02B {

    public static void main(String[] args) {
        // TODO code application logic here
        Television tv = new Television();
        tv.modelo = "Semp";
        tv.tamanho = 50;
        tv.resolucao = 1080;
        tv.led = true;
        tv.desligar();
        tv.smartTv();
        
        tv.status();
        System.out.println("------------------------------");
    }
    
}
