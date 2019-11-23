
package solid.SRP_Mal;

/**
 * Clase Rectangulo
 * Ejemplo de SRP mal construido.
 * @author weltonvs
 */
public class Rectangulo {
    private double base;
    private double altura;

    /**
     * Método constructor de la clase Rectangulo.
     * @param base
     * @param altura 
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que devuelve el valor de la base del rectangulo.
     * @return double
     */
    public double getBase() {
        return base;
    }

    /**
     * Metodo que modifica la base del rectangulo.
     * @param base double
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Método que devuelve la altura del rectangulo
     * @return double
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Método que modifica la altura del rectangulo
     * @param altura double
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    /**
     * Método que calcula el area del rectangulo.
     * @return double
     */
    public double area(){
        return this.base * this.altura;
    }
    
    /**
     * Método que calcula el perímetro del rectangulo
     * @return double
     */
    public double perimetro(){
        return (this.base * this.altura)/2;
    }
    
    /**
     * Método para dibujar un rectangulo.
     */
    public void dibujar(){
        System.out.println("Dibujar desde rectangulo");
    }
}
