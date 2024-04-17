package operacionherencia;

public class Division extends Multiplicacion {
    public double division(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("No se puede dividir por cero.");
            return 0;
        }
    }
}