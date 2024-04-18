package aula07a;

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    
    //Métodos Especiais
    public Lutador(String no, 
                   String na,
                   int id,
                   float al,
                   float pe, 
                   int vi, 
                   int de,
                   int em){
        nome = no;
        nacionalidade = na;
        idade = id;
        altura = al;
        this.setPeso(pe);
        vitorias = vi;
        derrotas = de;
        empates = em;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
        if (this.getPeso() < 52.2){
            categoria = "Inválido";
        }else if(this.getPeso() <= 70.3){
            categoria = "Leve";
        }else if(this.getPeso() <= 83.9){
            categoria = "Médio";
        }else if (this.getPeso() <= 120.2){
            categoria = "Pesado";
        }else{
            categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //Métodos Abstratos
    public void apresentar(){
        System.out.println("Lutador: "+ this.getNome());
        System.out.println("Origem: "+ this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando: "+ this.getPeso());
        System.out.println("Ganhou: "+ this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    public void status(){
        System.out.println(this.getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitorias() +" vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
