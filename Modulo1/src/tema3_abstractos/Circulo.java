
package tema3_abstractos;

/**
 * Ejemplo de una Subclase implementando métodos abstractos 
 * de la clase padre Figura del ejemplo de la diaspositiva del tema 3 DS
 * Página 48.
 * @author weltovs
 */
public class Circulo extends Figura{
    private double radio;
    
    /**
     * Método que implementa el método abstracto de la clase padre.
     * @return double 
     */
    @Override
    public double area(){
        return Math.PI * radio * radio;
    }
    
    /**
     * Método que implementa el método abstracto de la clase padre.
     * @return double 
     */
    @Override
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
}


