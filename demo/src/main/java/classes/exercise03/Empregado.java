package classes.exercise03;

public class Empregado {
    private String nome;
    private String sobrenome;
    private Double salario;
    
    public Empregado(String nome, String sobrenome, Double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        if(salario < 0){
            this.salario = 0.0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    
}
