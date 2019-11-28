
package patrones.adaptador.ejemplo.composicion;

import java.util.Date;

/**
 * Clase StandarReservasACMEAdapter
 * Ejemplo de uso del patrón adaptador.
 * Esta clase juega el papel de Adaptador del Adaptado (interfaz ReservasSL)
 * @author weltonvs
 */
public class StandarReservasACMEAdapter implements StandartReservasACME{
    
    private ReservasSL miSistema;

    /**
     * Constructor de la clase StandarReservasACMEAdapter
     * Juega un papel de envoltorio del sistemaSL.
     * @param miSistema 
     */
    public StandarReservasACMEAdapter(ReservasSL miSistema) {
        this.miSistema = miSistema;
    }

    /**
     * Método que devuelve la información del hotel.
     * Una adaptación a la API existe.
     * @param idHotel
     * @return 
     */
    @Override
    public String getInfoHotel(String idHotel) {
        return miSistema.hotelInfo(idHotel);
    }

    /**
     * Método que permite crear una reserva en el hotel.
     * @param fecha
     * @param dias
     * @param idHotel
     * @param cliente
     * @return 
     */
    @Override
    public String createReservation(Date fecha, int dias, String idHotel, String cliente) {
        long codigo = miSistema.creaReserva(idHotel, cliente, fecha, dias);
        return String.valueOf(codigo);
    }

    @Override
    public String getReservation(String codigo) {
        long codigolong = Long.parseLong(codigo);
        return miSistema.datosReserva(codigolong);
    }
    
    
    
    
}
