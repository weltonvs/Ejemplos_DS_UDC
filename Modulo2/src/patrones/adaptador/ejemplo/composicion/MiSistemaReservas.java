
package patrones.adaptador.ejemplo.composicion;

import java.util.Date;

/**
 * Clase MiSistemaReservas que implementa el interfaz ReservasSL
 * Patrón Adaptador.
 * Es la Clase concreta.
 * @author weltonvs
 */
public class MiSistemaReservas  implements ReservasSL{
    
    private String idHotel;
    private String cliente;
    private Date fecha;
    private int dias;

    public MiSistemaReservas() {
        
    }

    @Override
    public String hotelInfo(String idHotel) {
        
    }

    @Override
    public long creaReserva(String idHotel, String cliente, Date fecha, int dias) {
        this.idHotel = idHotel;
        this.cliente = cliente;
        this.fecha = fecha;
        this.dias = dias;
    }

    @Override
    public String datosReserva(long codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "MiSistemaReservas{" + "idHotel=" + idHotel + ", cliente=" + cliente + ", fecha=" + fecha + ", dias=" + dias + '}';
    }
}
