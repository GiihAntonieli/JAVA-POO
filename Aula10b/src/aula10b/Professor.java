package aula10b;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    public void receberAum(float aum){
        float aumento = this.getSalario() + aum / 100;
        this.setSalario(this.getSalario() + aumento);
    }

    
    
}
