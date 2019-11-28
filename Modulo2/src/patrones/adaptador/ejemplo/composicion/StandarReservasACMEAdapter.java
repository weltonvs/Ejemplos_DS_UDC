
package patrones.adaptador.ejemplo.composicion;

/**
 * Clase StandarReservasACMEAdapter
 * Ejemplo de uso del patrón adaptador.
 * Esta clase juega el papel de Adaptador del Adaptado (interfaz ReservasSL)
 * @author weltonvs
 */
public class StandarReservasACMEAdapter {
    
    private ReservasSL miSistema;

    /**
     * Constructor de la clase StandarReservasACMEAdapter
     * Juega un papel de envoltorio del sistemaSL.
     * @param miSistema 
     */
    public StandarReservasACMEAdapter(ReservasSL miSistema) {
        this.miSistema = miSistema;
    }
    
    
    
}
