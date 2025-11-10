package professor.model;

public class Disciplina {
    private Professor p;
    private Aluno a;
    private String nome_disciplina;

    public void associar(Professor p) {
        this.p = p;
    }

    public void matricular(Aluno a) {
        this.a = a;
    }

    public void mostrarDisciplina() {
        System.out.println(p.getName() + " ministra " + nome_disciplina);
    }
}