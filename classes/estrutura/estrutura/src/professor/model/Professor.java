package professor.model;

public class Professor {
    private String name;
    private String materia;

    public Professor(String name, String materia) {
        this.name = name;
        this.materia = materia;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
