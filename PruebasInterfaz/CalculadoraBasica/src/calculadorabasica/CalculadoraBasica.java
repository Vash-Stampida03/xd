package calculadorabasica;

public class CalculadoraBasica {

    float x;
    float y;
    float r;
    
    public CalculadoraBasica (float a, float b){
        
        x = a;
        y = b;
        r = 0;
    }
    public void imprimirResultado(){
        System.out.println("El resultado es = " + r);
    }
    public float sumar (float a, float b) {
        
        x = a;
        y = b;
        r = a + b;
        return r;
    }
    public float restar (float a, float b){
        
        x = a;
        y = b;
        r = a - b;
        return r;
    }
    public float multiplicar (float a, float b){
        x = a;
        y = b;
        r = a * b;
        return r;
    }
    public float dividir (float a, float b){
        x = a;
        y = b;
        r = a/b;
        return r;
    }
    
    public static void main(String[] args) {
        CalculadoraBasica obj1 = new CalculadoraBasica (0,0);
        obj1.sumar(8 , 87);
        obj1.imprimirResultado();
        obj1.restar(9,6);
        obj1.imprimirResultado();
        obj1.multiplicar(8,5);
        obj1.imprimirResultado();
        obj1.dividir(8,6
        );
        obj1.imprimirResultado();   
    }  
}
