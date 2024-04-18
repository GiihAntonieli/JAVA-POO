
package aula05teste;

import java.util.Scanner;

public class ContaBanco {
    Scanner t = new Scanner(System.in);
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco(){ //Método Construtor
        this.status = false;
        this.saldo = 0;
    }

    // Métodos Setter e Getter
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //Métodos de ação
    public void abrirConta(){
        System.out.println("Qual o seu  nome: ");
        this.setDono(t.next());
        System.out.println("Qual tipo de conta "+ this.getDono() +" deseja abrir: [CC/CP");
        this.setTipo(t.next());
        System.out.println("Informe o número da conta: ");
        this.setNumConta(t.nextInt());
        if ("CC".equals(this.tipo)){
            this.saldo = 50;
        }else if("CP".equals(this.tipo)){
            this.saldo = 150;
        }
        this.status = true;
        
    }
    
    public void fecharConta(){
        System.out.println("Informe número da Conta: ");
        int nConta = t.nextInt(); 
        if (this.saldo >0){
            System.out.println("Conta com dinheiro! Não é possível fechar conta.");
        }else if (this.saldo < 0){
            System.out.println("Conta em débito! Não é possível fechar conta;");
        }else{
           this.setNumConta(nConta);
           this.setStatus(false);
        }
        
        
    }
    
    public void depositar(){
        if (this.status == true){
            System.out.println("Quanto vc quer depositar: ");
            float din = t.nextFloat();
            this.saldo += din;
        }
    }
    
    public void sacar(){
        float din=0;
        if (this.status == true){
            System.out.println("Quanto "+ this.getDono()+ " deseja sacar: ");
            din = t.nextFloat();
            if (this.saldo != 0 /*&& din < this.saldo*/){
                saldo -= din;
            }/*else{
                System.out.println(this.getDono() +" não pode sacar!");
            }*/
        }
    }
    
    public void pagarMensal(){
        int v;
        if ("CC".equals(this.tipo)){
            v = 12;
        }else{
            v = 20;
        }
        if (this.status == true){ 
            if (this.saldo > v){
                this.setSaldo(getSaldo() - v);
            }else{
                System.out.println("Saldo Insuficiente!");
            }
        }else{
            System.out.println("Impossível pagar!");
        }
    }
    
    public void status(){
        System.out.println("Número da Conta: "+ this.numConta);
        System.out.println("Dono: " +  this.dono);
        System.out.println("Tipo: "+ this.tipo);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Conta aberta: " + this.status);
    }
}
