
package patrones.adaptador.ejemplo.composicion;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

/**
 * Clase App
 * Utilizado para probar el Patrón Adaptador
 * Hace el papel de cliente de la interfaz StandarReservasACME
 * @author weltonvs
 */
public class App {
    public static void main(String[] args){
        ReservasSL sistemaAdaptado = new MiSistemaReservas();
        
        StandartReservasACME reserva = new StandarReservasACMEAdapter(sistemaAdaptado);
        Date fecha = Date.valueOf(LocalDate.now());
        reserva.createReservation(fecha, 10, "1", "Welton");
        
        System.out.println(reserva.getInfoHotel("1"));
    }
}
