
package aula02b;

import java.util.Scanner;

public class Television {
    Scanner t = new Scanner(System.in);
    String modelo;
    boolean smart;
    float tamanho;
    float resolucao;
    boolean led;
    boolean ligado;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Smart: " + this.smart);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Resolução: " + this.resolucao);
        System.out.println("Led: " + this.led);
        System.out.println("Ligado: " + this.ligado  );
    }
    
    void ligar(){
        this.ligado = true;
    }
    
    void desligar(){
        this.ligado = false;
    }
    
    void smartTv(){
        this.smart = true;
        System.out.println("Selecione qual APP vc quer entrar:");
        System.out.println("[1]YouTube");
        System.out.println("[2]PrimeVideo");
        System.out.println("[3]Disney+");
        System.out.println("[4]HBO Max");
        int opcao = t.nextInt();
        if (opcao == 1){
            System.out.println("Youtube SELECIONADO!");
        }else if (opcao == 2){
            System.out.println("PrimeVideo SELECIONADO!");
        }else if (opcao == 3){
            System.out.println("Disney+ SELECIONADO!");
        }else if (opcao == 4){
            System.out.println("HBO Max SELECIONADO!");
        }else{
            System.out.println("Tente outra vez!!! ");
            System.out.println("[1]YouTube");
            System.out.println("[2]PrimeVideo");
            System.out.println("[3]Disney+");
            System.out.println("[4]HBO Max");
        }
        System.out.println("=============================");
        
    } 
    
     void canais(){
         this.smart = false;
         String canal[] = {"Globo", "SBT", "RECORD", "Band", "RedeTv", 
             "Telecine", "GNT", "StarTv", "Disney", "WarnerChannel" };
         System.out.println("==============================");
         for (int cont=0; cont < 10; cont++){
             System.out.println( canal[cont]+" é o " + cont + " canal ");
         }
         System.out.println("==============================");
     }
     
     
}
