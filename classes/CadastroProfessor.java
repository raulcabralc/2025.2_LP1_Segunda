import java.util.ArrayList;

public class CadastroProfessor {
    private ArrayList<Professor> professores = new ArrayList<>();

    public void index() {
        professores.forEach(System.out::println);
    }

    public Object listar(String name) {
        for (Professor professor : professores) {
            if (professor.getName().equals(name)) {
                return professor;
            }
        }

        return "Not found";
    }

    public String criar(Professor p) {
        professores.add(p);
        return "Professor " + p.getName() + " adicionado.";
    }

    public String deletar(Professor p) {
        professores.remove(p);
        return "Professor " + p.getName() + " removido.";
    }
}
