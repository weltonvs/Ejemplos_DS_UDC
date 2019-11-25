
package patronestado.Mal;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Libro
 * Patrón Estado
 * implementación que no cumple con el patrón estado
 * con sentencias condicionales.
 * @author weltonvs
 */
public class Libro {
    
    private enum Estado {DISPONIBLE, PRESTADO, RESERVADO};
    private Estado estado = Estado.DISPONIBLE;
    private List<String> reservas = new ArrayList<>();
    private String lectorActual;
    private boolean unaSemanaReservado = false;
    
    /**
     * Método solicitar prestamo de un libro.
     * @param cliente 
     */
    public void solicitarPrestamo(String cliente){
        if(estado == Estado.DISPONIBLE){
            estado = Estado.PRESTADO;
            lectorActual = cliente;
            System.out.println("Prestado a " + cliente);
        } else if(estado == Estado.PRESTADO){
            reservas.add(cliente);
            System.out.println("Reservado a " + cliente);
        } else if(estado == Estado.RESERVADO){
            if(cliente.equals(reservas.get(0))){
                estado = Estado.PRESTADO;
                lectorActual = cliente;
                System.out.println("Prestando libro reservado a " + cliente);
                reservas.remove(0);
            } else {
                reservas.add(cliente);
                System.out.println("Nueva reserva de " + cliente);
            }
        }
    }
    
    /**
     * Método que efectua la devolución del libro.
     */
    public void devolver(){
        if(estado == Estado.PRESTADO){
            if(reservas.isEmpty()){
                estado = Estado.DISPONIBLE;
                 System.out.println("Libro disponible...");
            } else {
                estado = Estado.RESERVADO;
                System.out.println("Libro en reserva de " + reservas.get(0));
            }
        } else if(estado == Estado.RESERVADO){
            if(unaSemanaReservado){
                reservas.remove(0);
                unaSemanaReservado = false;
                System.out.println("Caduca la reserva");
                if(reservas.isEmpty()){
                    estado = Estado.DISPONIBLE;
                    System.out.println("Libro disponible...");
                } else {                    
                    System.out.println("Libro reservado a " + reservas.get(0));
                }
            }
        }
    }
}
