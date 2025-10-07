public class ClinicoGeral extends Medico {
    protected boolean atendeEmCasa;

    public void receitar(String pacienteId) {
        System.out.println(pacienteId + " recebeu a receita.");
    }

    public ClinicoGeral(String nome, String CRM, boolean trabalhaNoHospital, boolean atendeEmCasa) {
        super(nome, CRM, trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public boolean isAtendeEmCasa() {
        return atendeEmCasa;
    }

    public void setAtendeEmCasa(boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }
}
