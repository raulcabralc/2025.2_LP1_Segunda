public class Medico {
    protected String nome;
    protected String CRM;
    protected boolean trabalhaNoHospital;

    protected void tratarPaciente(String pacienteId) {
        System.out.println("Paciente " + pacienteId + " tratado.");
    }

    public Medico(String nome, String CRM, boolean trabalhaNoHospital) {
        this.nome = nome;
        this.CRM = CRM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public boolean isTrabalhaNoHospital() {
        return trabalhaNoHospital;
    }

    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }
}
