
package patronestado.Bien;

/**
 *
 * @author welto
 */
public class Reservado implements EstadoLibro{
    
    private static final Reservado instancia = new Reservado();

    /**
     * Constructor privado
     */
    private Reservado() {
        //Vacio.
    }

    /**
     * Método que devuelve una instancia de Reservado.
     * @return instancia
     */
    public static Reservado getInstancia() {
        return instancia;
    }
    
    
    
    
    @Override
    public void solicitarPrestamo(Libro libro, String cliente) {
        if(libro.getReservas().isEmpty()){ 
            if(libro.getReservas().get(0).equals(cliente)){
                libro.setEstado(Prestado.getInstancia());
                libro.setLectorActual(cliente);
                libro.removerReserva(0);
                System.out.println("Prestado libro a " + cliente);
            } else {
                libro.adicionarReserva(cliente);
            }
        } else {        
            libro.setEstado(Prestado.getInstancia());
            libro.setLectorActual(cliente);
        }
    }

    @Override
    public void devolver(Libro libro) {
        if(libro.getReservas().isEmpty()){
            if(libro.getUnaSemanaReservado()){
                libro.removerReserva(0);
            }
            
        } else if(!libro.getUnaSemanaReservado()){
            libro.removerReserva(0);
            libro.setEstado(Disponible.getInstancia());
            libro.setLectorActual(null);
        }
    }
}
