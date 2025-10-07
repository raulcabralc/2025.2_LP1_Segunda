public class Cirurgiao extends Medico {
    public void fazerIncisao(String pacienteId) {
        System.out.printf("Incisão feita (%s)", pacienteId);
    }

    public Cirurgiao(String nome, String CRM, boolean trabalhaNoHospital) {
        super(nome, CRM, trabalhaNoHospital);
    }
}
