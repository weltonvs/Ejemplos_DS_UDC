
package patronestado.Bien;

/**
 *
 * @author welto
 */
public class Prestado implements EstadoLibro{

    private static final Prestado instancia = new Prestado();

    /**
     * Constructor privado
     */
    private Prestado() {
        //vacio
    }

    /**
     * Método que devuelve una instancia de Prestado
     * La instancia de Prestado es un objeto inmutable.
     * @return instancia
     */
    public static Prestado getInstancia() {
        return instancia;
    }
    
    
    @Override
    public void solicitarPrestamo(Libro libro, String cliente) {
        libro.adicionarReserva(cliente);
        System.out.println("Reserva de " +  cliente);
    }

    @Override
    public void devolver(Libro libro) {
        if(libro.getReservas().isEmpty()){
            libro.setEstado(Disponible.getInstancia());
            System.out.println("Libro disponible...");
        } else {
            libro.setEstado(Reservado.getInstancia());
            System.out.println("Libro en reserva de " + libro.getReservas().get(0));
        }
    }
}
