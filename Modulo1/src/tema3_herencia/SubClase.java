
package tema3_herencia;

/**
 * Ejemplo de una Subclase del ejemplo de la diaspositiva del tema 3 DS
 * Página 44.
 * @author weltovs
 */
public class SubClase extends SuperClase {
    private int subvalor;

    public SubClase(int valor, int subvalor) {
        super(valor);
        this.subvalor = subvalor;
    }
}

