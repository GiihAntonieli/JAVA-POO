
package aula04;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String m, String c, float p){ //Esse é o método construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Tampada: " + this.tampada);
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        modelo = m;
    }
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        cor = c;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        ponta = p;
    }
    
    public boolean getTampada(){
        return tampada;
    }
    public void setTampada(boolean t){
        tampada = t;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    
    
}
