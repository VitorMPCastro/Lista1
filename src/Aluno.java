public class Aluno {
    private String nome;
    private int matricula;
    private double nota1, nota2, notaTrabalho;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }


    public double mediaAluno() {
        return ((((nota1 + nota2)/2)*2.5+notaTrabalho*2)/3 ); // sei la se essa é a lógica do cálculo, mas isso não importa agora
    }

    public double finalAluno() {
        return (mediaAluno() < 6) ? 10 - mediaAluno() : 0;
    }
}
