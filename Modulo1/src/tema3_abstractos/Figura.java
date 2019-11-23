
package tema3_abstractos;

/**
 * Ejemplo de una Superclase abstracta del ejemplo de la diaspositiva del tema 3 DS
 * Página 48.
 * @author weltovs
 */
public abstract class  Figura {
    /**
     * Atributos de la clase Figura
     */
    private int x;
    private int y;
    
    /**
     * Método no abstracto en de una clase abstracta.
     * @param x int
     * @param y int
     */
    public void moverA(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Método no abstracto en de una clase abstracta.
     * @return 
     */
    public int getX() {
        return x;
    }

    /**
     * Método no abstracto en de una clase abstracta.
     * @return 
     */
    public int getY() {
        return y;
    }   
    
    public abstract double area();
    public abstract double perimetro();
}
