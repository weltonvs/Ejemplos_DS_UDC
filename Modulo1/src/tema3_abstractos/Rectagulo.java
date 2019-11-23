
package tema3_abstractos;


public class Rectagulo extends Figura {
    
    private double base;
    private double altura;

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return (base * 2) + (altura * 2);
    }
}


