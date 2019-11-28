
package patrones.observador;

import java.util.Vector;

/**
 * Clase Observavel.
 * Patrón Observador.
 Observavel representa el Sujeto del patrón observador.
 * @author weltonvs
 */
public class Observavel {
    
    private boolean cambiada;
    private Vector vectorObservadores;

    /**
     * Constructor de la clase Observavel.
     */
    public Observavel() {
        vectorObservadores = new Vector();
    }
    
    public synchronized void adicionarObservador(Observador observador){
        if(observador == null){
            throw new NullPointerException();
        }
        
        if(!vectorObservadores.contains(observador)){
            vectorObservadores.add(observador);
        }
    }
    
    public synchronized void deleteObservador(Observador observador){
        vectorObservadores.remove(observador);
    }
    
    public synchronized void deleteObservadores(){
        vectorObservadores.removeAllElements();
    }
    
    public synchronized int cantidadObservadores(){
        return vectorObservadores.size();
    }
    
    protected synchronized void setCambiada(){
        cambiada = true;
    }
    
    protected synchronized void limpiarCamabiada(){
        cambiada = false;
    }
    
    public synchronized boolean getCambiada() {
        return cambiada;
    }
    
    public void notificarObservadores(){
        notificarObservadores(null);
    }
    
    public void notificarObservadores(Object argumento){
        Object[] arrLocal;
        
        synchronized (this) {
            if(!cambiada) return;
            arrLocal = vectorObservadores.toArray();
            limpiarCamabiada();
        }
        
        for(int i = arrLocal.length-1; i >= 0; i--){
            ((Observador)arrLocal[i]).actualizar(this, argumento);
        }
    }
}
