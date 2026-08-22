package semana2;

public class AreaRectangulo {

    public static double calcularAreaRectangulo(double base, double altura){
        return base*altura;
    }

    static void main() {
        calcularAreaRectangulo(10.5,20.4);
        calcularAreaRectangulo(5.5,40.3);
        calcularAreaRectangulo(101, 100);
    }
}
