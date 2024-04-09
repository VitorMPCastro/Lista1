public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        verificaData();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void verificaData() throws IllegalArgumentException {

        try {
            if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 0) {
                this.dia = 1;
                this.mes = 1;
                this.ano = 1;
                throw new IllegalArgumentException("Data inválida");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public int comparaData(Data data) {
        if (this.ano > data.getAno()) {
            return 1;
        } else if (this.ano < data.getAno()) {
            return -1;
        } else {
            if (this.mes > data.getMes()) {
                return 1;
            } else if (this.mes < data.getMes()) {
                return -1;
            } else {
                return Integer.compare(this.dia, data.getDia());
            }
        }
    }

    public boolean isBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }

    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }

}
