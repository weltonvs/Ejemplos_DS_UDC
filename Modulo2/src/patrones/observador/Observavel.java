
package patrones.observador;

import patronestrategia.Vector;

/**
 * Clase Observavel.
 * Patrón Observador.
 * Observavel representa el Sujeto del patrón observador.
 * @author weltonvs
 */
public class Observavel {
    
    private boolean cambiada;
    private Vector obs;

    /**
     * Constructor de la clase Observavel.
     */
    public Observavel() {
        obs = new Vector();
    }
    
    public synchronized void adicionarObservador(Obsevador observador){
        if(observador == null){
            throw new NullPointerException();
        }
        
        if(!obs)
    }
}
