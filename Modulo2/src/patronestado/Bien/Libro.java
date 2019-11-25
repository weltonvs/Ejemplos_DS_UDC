
package patronestado.Bien;

import java.util.List;
import java.util.ArrayList;

/**
 * Clase Libro
 * Utilizando el Patrón Estado
 * Parte de Contexto del patrón estado.
 * @author weltonvs
 */
public class Libro {
    private EstadoLibro estado = Disponible.getInstancia();
    private List<String> reservas = new ArrayList<>();
    private boolean unaSemanaReservado = false;
    private String lectorActual;
   
    /**
     * Método que delega solicitar prestado a Estado.
     * @param cliente 
     */
    public void solicitarPrestamo(String cliente){
        estado.solicitarPrestamo(this, cliente);
    }
    
    /**
     * Método que delega devolver prestamo a Estado.
     */
    public void devolver(){
        estado.devolver(this);
    }
    
    /**
     * Método que devuelve el estado del libro.
     * @return EstadoLibro
     */
    public EstadoLibro getEstado(){
        return estado;
    }
    
    /**
     * Método que modifica el estado del libro.
     * @param estado 
     */
    public void setEstado(EstadoLibro estado){
        this.estado = estado;
    }

    /**
     * Método que devuelve el lector actual.
     * @return 
     */
    public String getLectorActual() {
        return lectorActual;
    }

    /**
     * Método que modifica el lector actual
     * @param lectorActual 
     */
    public void setLectorActual(String lectorActual) {
        this.lectorActual = lectorActual;
    }

    /**
     * Método que devuelve la lista de reservas.
     * @return 
     */
    public List<String> getReservas() {
        return reservas;
    }
    
    

    /**
     * Método que aplica una reserva a un cliente.
     * @param cliente 
     */
    public void adicionarReserva(String cliente) {
        this.reservas.add(cliente);
    }
    
    /**
     * Método que remove una reserva a un cliente.
     * @param cliente 
     */
    public void removerReserva(int posicion) {
        this.reservas.remove(posicion);
    }

    public boolean getUnaSemanaReservado() {
        return unaSemanaReservado;
    }

    public void setUnaSemanaReservado(boolean unaSemanaReservado) {
        this.unaSemanaReservado = unaSemanaReservado;
    }
    
    
    
    
}
