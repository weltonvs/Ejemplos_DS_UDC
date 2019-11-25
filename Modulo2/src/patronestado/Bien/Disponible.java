
package patronestado.Bien;

/**
 * Clase Disponible que implementa el interfaz EstadoLibro
 * Patrón Estado
 * Parte Estado Concreto A del patrón estado.
 * @author weltonvs
 */
public class Disponible implements EstadoLibro{
    private static final Disponible instancia = new Disponible();
    
    private Disponible(){
        //vacio.
    }

    /**
     * Método que devuelve una instancia de Disponible
     * La instancia de Disponible es un objeto inmutable.
     * @return 
     */
    public static Disponible getInstancia() {
        return instancia;
    }

    /**
     * Método que solicita prestamo del libro.
     * @param libro
     * @param cliente 
     */
    @Override
    public void solicitarPrestamo(Libro libro, String cliente) {
        libro.setEstado(Prestado.getInstancia());
        libro.setLectorActual(cliente);
        System.out.println("Prestado libro a " + cliente);
    }

    @Override
    public void devolver(Libro libro) {
        if(libro.getEstado().getClass().equals(instancia)){
            System.out.println("El libro no se puede devolver, porque ya se encuentra en estado de Disponible");
        }
    }
    
    
}
