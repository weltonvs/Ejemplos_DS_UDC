
package patrones.adaptador.ejemplo.composicion;

import java.util.Date;

/**
 * Interfaz ReservaSL
 * Ejemplo de uso del patrón adaptador.
 * Esta interfaz hace de Adaptado.
 * @author weltonvs
 */
public interface ReservasSL {
    
    public String hotelInfo(String idHotel);
    public long creaReserva(String idHotel, String cliente, Date fecha, int dias);
    public String datosReserva(long codigo);
    
}
