package operacionherencia;

public class Menu {
    private Division division;

    public Menu() {
        division = new Division();
    }

    public void menu(){
        int opc;
        System.out.println("""
                           1. Suma
                           2. Resta
                           3. Multiplicacion
                           4. Division
                           5. Salir""");

        opc = (int) division.pedirdato(" la opcion");

        if (opc == 1) {
            double n = division.pedirdato(" primer dato suma");
            division.setNum1(n);
            double m = division.pedirdato(" segundo dato suma");
            division.setNum2(m);
            double r = division.suma(division.getNum1(), division.getNum2());
            division.mostrarresultado(" la suma ", r);
        } else if (opc == 2) {
            division.setNum1(division.pedirdato(" primer dato resta"));
            division.setNum2(division.pedirdato(" segundo dato resta"));
            division.mostrarresultado(" la resta", division.resta(division.getNum1(), division.getNum2()));
        } else if (opc == 3) {
            division.setNum1(division.pedirdato(" primer dato multiplicacion"));
            division.setNum2(division.pedirdato(" segundo dato multiplicacion"));
            division.mostrarresultado(" la multiplicacion", division.multiplicacion(division.getNum1(), division.getNum2()));
        } else if (opc == 4) {
            division.setNum1(division.pedirdato(" dividendo"));
            division.setNum2(division.pedirdato(" divisor"));
            division.mostrarresultado(" la division", division.division(division.getNum1(), division.getNum2()));
        } else if (opc == 5) {
            System.out.println("Gracias");
        } else {
            System.out.println("Opcion no valida");
        }
    }
}
