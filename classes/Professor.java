public class Professor extends Pessoa {
    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    private double salario;

    public void calcularSalario() {
        salario = 300 * 40;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
