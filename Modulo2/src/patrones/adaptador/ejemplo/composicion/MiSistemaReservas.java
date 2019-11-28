
package patrones.adaptador.ejemplo.composicion;

import java.util.Date;

/**
 * Clase MiSistemaReservas que implementa el interfaz ReservasSL
 * Patrón Adaptador.
 * Es la Clase concreta.
 * @author weltonvs
 */
public class MiSistemaReservas  implements ReservasSL{

    public MiSistemaReservas() {
    }

    @Override
    public String hotelInfo(String idHotel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long creaReserva(String idHotel, String cliente, Date fecha, int dias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String datosReserva(long codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
