package operacionherencia;

import java.util.Scanner;

public class Operacion {
    private double num1; // Cambiar de int a double
    private double num2; // Cambiar de int a double
    Scanner sc;
    
    public Operacion(){
        num1=0;
        num2=0;
        sc = new Scanner(System.in);
    }
    
    public void setNum1(double num1){ // Cambiar de int a double
        this.num1 = num1;
    }
    public double getNum1(){ // Cambiar de int a double
        return this.num1;
    }
    
    public void setNum2(double num2){ // Cambiar de int a double
        this.num2 = num2;
    }
    public double getNum2(){ // Cambiar de int a double
        return this.num2;
    }
    
    public double suma(double x, double y){ // Cambiar de int a double
        return x + y;
    }
    
    public double resta(double z, double w){ // Cambiar de int a double
        return z - w;
    }
    
    public void mostrarresultado(String opera, double resultado){ // Cambiar de int a double
        System.out.println("El resultado de " + opera + " es " + resultado); // Cambiar de int a double
    }
    
    public double pedirdato(String l){ // Cambiar de int a double
        System.out.println("digite un numero para " + l);
        double n=sc.nextDouble(); // Cambiar de int a double
        return n;
    }
}

