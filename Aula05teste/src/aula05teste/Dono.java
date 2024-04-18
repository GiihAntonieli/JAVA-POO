
package aula05teste;

public class Dono {
    private String nome;
    private float cpf;
    private int anoNasc;
    
    public Dono(String n){
        this.nome = n;
        /*this.cpf = c;
        this.anoNasc = ano;*/
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        nome = n;
    }
    
    /*public float getCpf(){
        return cpf;
    }
    public void setCpf(float c){
        cpf = c;
    }
    
    public int getAnoNasc(){
        return anoNasc;
    }
    public void setAnoNasc(int ano){
        anoNasc = ano;
    }*/
    
    public void status(){
        System.out.println("Nome: " + this.nome);
        /*System.out.println("CPF: "+ this.cpf);
        System.out.println("Ano de Nascimento: "+ this.anoNasc);*/
    }
}
