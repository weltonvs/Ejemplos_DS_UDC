
package tema3_Genericos;

/**
 * Ejemplo de creación de una clase genérica.
 * Ejemplo del tema 3 de DS
 * Página 137.
 * @author weltonvs
 */
public class CajaGenerica<T> {
    private T objeto;
    
    /**
     * Constructor de un parámetro de la clase CajaGenerica.
     * @param objeto T
     */
    public CajaGenerica(T objeto) {
        this.objeto = objeto;
    }

    /**
     * Método que devuelve un objeto genérico.
     * T puede ser cualquier tipo objeto que haya sido almacenado previamente.
     * @return T
     */
    public T getObjeto() {
        return objeto;
    }

    /**
     * Método que inserta un objecto genérico al atributo de la clase CajaGenerica
     * El parámetro T puede ser cualquier tipo de objeto.
     * @param objeto T 
     */
    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
}
