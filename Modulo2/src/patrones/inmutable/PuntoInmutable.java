
package patrones.inmutable;

/**
 * Clase PuntoInmutable
 * Ejemplo de un Patrón Inmutable
 * Esa clase tiene un incoveniente. Por cada punto hay que instanciar uno nuevo.
 * @author weltonvs
 */
public final class PuntoInmutable {
    private final int x;
    private final int y;
    
    /**
     * Método constructor
     * @param x
     * @param y 
     */
    public PuntoInmutable(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Método para recuperar el punto x.
     * @return 
     */
    public int getX() {
        return x;
    }
    
    /**
     * Método recuperar el punto y.
     * @return 
     */
    public int getY() {
        return y;
    }
    
    /**
     * Método para mover el punto.
     * @param x
     * @param y
     * @return 
     */
    public PuntoInmutable mover(int x, int y){
        return new PuntoInmutable(this.x + x, this.y + y);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.x;
        hash = 17 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PuntoInmutable other = (PuntoInmutable) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
}
