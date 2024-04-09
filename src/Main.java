public class Main {
    public static void main(String[] args) {
        Voo voo = new Voo(1, new Data(1, 1, 2021), "12:00");
        try {
            voo.ocupaLugar(voo.proximoLivre());
        } catch (PlaneFullException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Lugar ocupado.");
        }
    }
}