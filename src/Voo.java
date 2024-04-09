import javax.swing.*;

public class Voo {
    private int numeroVoo;
    final private int capacidade = 100;
    private Data data;
    private String horario;
    private boolean[] lugares;

    public Voo(int numeroVoo, Data data, String horario) {
        this.numeroVoo = numeroVoo;
        this.data = data;
        this.horario = horario;
        this.lugares = new boolean[capacidade];
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean[] getLugares() {
        return lugares;
    }

    public void setLugares(boolean[] lugares) {
        this.lugares = lugares;
    }

    public int proximoLivre() throws PlaneFullException {

        for (int i = 0; i < capacidade; i++) {
            if (!lugares[i]) {
                return i;
            }
        }
        throw new PlaneFullException();
    }

    public void ocupaLugar(int lugar) {
        if (verificaLugar(lugar)) {
            JOptionPane.showMessageDialog(null, "Lugar já ocupado");
        } else {
            lugares[lugar] = true;
            JOptionPane.showMessageDialog(null, "Lugar ocupado com sucesso");
        }
    }

    public boolean verificaLugar(int lugar) {
        return lugares[lugar];
    }
}
