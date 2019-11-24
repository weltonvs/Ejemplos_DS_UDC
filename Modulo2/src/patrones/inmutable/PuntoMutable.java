
package patrones.inmutable;

/**
 * Clase PuntoMutable
 * Para solucionar el problema de la clase inmutable.
 * @author weltonvs
 */
public class PuntoMutable {
    private int x;
    private int y;

    /**
     * Constructor del PuntoMutable
     * @param x
     * @param y 
     */
    public PuntoMutable(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Constructor del PuntoMutable con el PuntoInmutable
     * Metodo que convierte el PuntoMutable en PuntoInmutable
     * @param puntoInmutable 
     */
    public PuntoMutable(PuntoInmutable puntoInmutable){
        this(puntoInmutable.getX(),puntoInmutable.getY());
    }
    
    /**
     * Modifica los puntos de PuntoMutable
     * @param x
     * @param y
     * @return 
     */
    public PuntoMutable mover(int x, int y){
        this.x += x;
        this.y += y;
        return this;
    }
    
    /**
     * Devuelve el punto inmutable
     * @return PuntoInmutable
     */
    public PuntoInmutable getInMutable(){
        return new PuntoInmutable(x, y);
    }
    
    
}
