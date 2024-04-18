
package aula05teste;

public class Aula05teste {

    public static void main(String[] args) {
        Dono jubileu = new Dono("Jubileu");
        jubileu.status();
        System.out.println("---------------------------");
        Dono creuza = new Dono("Creuza");
        creuza.status();
        System.out.println("---------------------------");
        ContaBanco c1 = new ContaBanco();
        c1.setDono(creuza.getNome());
        c1.status();
        c1.abrirConta();
        c1.depositar();
        c1.sacar();
        c1.fecharConta();
        c1.status();
        
    }
    
}
