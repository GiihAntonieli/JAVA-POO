
package aula09b;


public class Aula09b {


    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Predro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "maria Candido", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avacarPag();
        System.out.println(l[0].detalhes());
        
        l[1].abrir();
        l[1].folhear(500);
        l[1].voltarPag();
        l[1].fechar();
        System.out.println(l[1].detalhes());

        
        
        
    }
    
}
