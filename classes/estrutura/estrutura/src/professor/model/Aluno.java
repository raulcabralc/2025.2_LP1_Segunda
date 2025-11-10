package professor.model;

import professor.model.enums.Cargo;

public final class Aluno extends Pessoa {
    private String matricula;
    private double media, n1, n2, n3;
    private Cargo cargo;

    public Aluno(String nome, int idade, String matricula, double n1, double n2, double n3) {
        super(nome, idade);
        this.matricula = matricula;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public void calcularMedia() {
        media = (n1 + n2 + n3) / 3;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public void quemSouEu() {}

    @Override
    public void minhaAtividade() {}
}