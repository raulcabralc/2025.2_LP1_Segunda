package professor.service;

import professor.model.Professor;

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
        return "professor.model.Professor " + p.getName() + " adicionado.";
    }

    public String deletar(Professor p) {
        professores.remove(p);
        return "professor.model.Professor " + p.getName() + " removido.";
    }
}
