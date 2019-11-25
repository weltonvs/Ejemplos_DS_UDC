
package patronestado.Bien;

/**
 * Interfaz EstadoLibro
 * Patrón Estado.
 * Parte Estado del patrón estado.
 * @author weltonvs
 */
public interface EstadoLibro {
    public void solicitarPrestamo(Libro libro, String cliente);
    public void devolver(Libro libro);
}
