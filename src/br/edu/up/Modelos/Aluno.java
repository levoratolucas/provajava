package br.edu.up.Modelos;

public class Aluno {

    private int matricula;
    private String nome;
    private double nota;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getnota() {
        return nota;
    }
    public void setnota(double nota) {
        this.nota = nota;
    }
    public int getmatricula() {
        return matricula;
    }
    public void setmatricula(int matricula) {
        this.matricula = matricula;
    }
}
