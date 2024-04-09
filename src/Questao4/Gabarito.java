package Questao4;

import java.util.Scanner;

public class Gabarito {
    private char[] respostas;

    public Gabarito(char[] respostas) {
        this.respostas = respostas;
    }

    public char respostaQuestao(int numeroQuestao) {
        return respostas[numeroQuestao];
    }

    private void inputRespostas() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.respostas.length; i++) {
            System.out.print("Digite a resposta da questão " + (i + 1) + ": ");
            this.respostas[i] = scanner.next().charAt(0);
        }
        scanner.close();
    }

    public char[] getRespostas() {
        return respostas;
    }

    public void setRespostas(char[] respostas) {
        this.respostas = respostas;
    }

    public void setRespostas(int length) {
        this.respostas = new char[length];
        this.inputRespostas();
    }
}
