
package patrones.adaptador.ejemplo.composicion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    
    private static List<MiSistemaReservas> listaReservas = new ArrayList<>();

    public MiSistemaReservas() {
        
    }

    @Override
    public String hotelInfo(String idHotel) {
        String aux = null;
        for(MiSistemaReservas reserva: listaReservas){
            if(reserva.idHotel.equals(idHotel)){
                aux = reserva.toString();
            }
        }
        return aux;
    }

    @Override
    public long creaReserva(String idHotel, String cliente, Date fecha, int dias) {
        int position;
                
        if(MiSistemaReservas.listaReservas.size() > 0){
            position = MiSistemaReservas.listaReservas.size()-1;
        } else {
            position = 0;
        }
        
        this.idHotel = idHotel;
        this.cliente = cliente;
        this.fecha = fecha;
        this.dias = dias;
        MiSistemaReservas.listaReservas.add(this);
        return (long)position + 1;
    }

    @Override
    public String datosReserva(long codigo) {
        int aux = ((int)codigo)-1;
        
        return MiSistemaReservas.listaReservas.get(aux).toString();
    }

    @Override
    public String toString() {
        return "MiSistemaReservas{" + "idHotel=" + idHotel + ", cliente=" + 
                cliente + ", fecha=" + fecha + ", dias=" + dias + '}';
    }
}
