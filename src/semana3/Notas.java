package semana3;

public class Notas {
    public static void main(String[] args) {
        double nota = 4.8;

        if(nota < 4.0) {
            System.out.println("Nota Inferior");
        } else if(nota >= 4.0 && nota <= 5.9) {
            System.out.println("Nota Superior");
        } else if(nota >= 6.0 && nota < 6.7) {
            System.out.println("Nota Buena");
        } else if(nota >= 6.8 && nota <= 7.0) {
            System.out.println("Nota muy buena");
        }
    }
}
