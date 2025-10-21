package Animais;

public class Cachorro extends Animal implements Corrida {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void correr() {}
}
