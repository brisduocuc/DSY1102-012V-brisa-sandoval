package semana3;

public class Farenheit {
    public static void main(String[] args) {
        double celcius = 12.5;
        double fahrenheit = celciusToFa(celcius);
        showMessage(fahrenheit);
    }

    public static double celciusToFa(double celcius){
        return (celcius * 1.8) + 32;
    }

    public static void showMessage(double celcius){
        System.out.println("Celcius: " + celcius);
    }
}
