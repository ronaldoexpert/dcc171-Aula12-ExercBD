package dcc171.aula16.exerciciobd;

import java.sql.Date;

public class Visitante {
    String nome;
    Integer idade;
    Date entrada;
    Date saida;

    public Visitante(String nome, Integer idade, Date entrada, Date saida) {
        this.nome = nome;
        this.idade = idade;
        this.entrada = entrada;
        this.saida = saida;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Visitante() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
}
