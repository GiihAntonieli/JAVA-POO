
package aula06;

public class ControleRemoto implements Controlador{
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos Especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public boolean getLigado(boolean par) {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Métodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desliga() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----MENU----");
        System.out.println("Está ligado? " + this.getLigado(true));
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; this.getVolume() > i; i+=10){
            System.out.print("| ");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu... ");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado(true)){
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado(true)){
            this.setVolume(this.getVolume() - 1);
        } else {
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado(true) && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado(ligado)&& this.getVolume()==0){
            this.setVolume(50);
        } 
    }

    @Override
    public void play() {
        if(this.getLigado(true) && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Não consegui reproduzir!");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado(true) && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Não consegui pausar!");
        }
    }
    
    
}
