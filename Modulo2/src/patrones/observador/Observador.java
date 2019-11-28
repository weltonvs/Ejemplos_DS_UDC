
package patrones.observador;

/**
 * Interfaz  Observador
 * Patrón Observador.
 * Observador representa el Observador del patrón Observador.
 * @author weltonvs
 */
public interface Observador {
    
    public void actualizar(Observavel observavel, Object argumento);
    
}
