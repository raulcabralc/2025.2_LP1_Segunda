public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularSalario() {
        salario = 300 * 40;
    }

    @Override
    public void quemSouEu() {}

    @Override
    public void minhaAtividade() {}
}
