
package patrones.adaptador.ejemplo.composicion;

import java.util.Date;

/**
 * Interfaz StandartReservasACME
 * Ejemplo de uso del patrón adaptador.
 * Esta interfaz hace de Objetivo.
 * @author weltonvs
 */
public interface StandartReservasACME {
    
    public String getInfoHotel(String idHotel);
    public String createReservation(Date fecha, int dias, String idHotel, String cliente);
    public String getReservation(String codigo);
    
}
