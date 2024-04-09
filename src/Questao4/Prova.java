package Questao4;

public class Prova extends Gabarito {
    private char[] respostasAluno;
    private String nomeAluno;
    private int[] pesos;
    private int nota;

    public Prova(char[] respostas, char[] respostasAluno, String nomeAluno, int[] pesos) {
        super(respostas);
        this.respostasAluno = respostasAluno;
        this.nomeAluno = nomeAluno;
        this.pesos = pesos;
        this.nota = 0;
    }

    public char[] getRespostasAluno() {
        return respostasAluno;
    }

    public void setRespostasAluno(char[] respostasAluno) {
        this.respostasAluno = respostasAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int[] getPesos() {
        return pesos;
    }

    public void setPesos(int[] pesos) {
        this.pesos = pesos;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
