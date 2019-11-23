
package solid.LSP_Mal;

/**
 * Clase SuperClase
 * Principio de Sustiución de Liskov - LSP
 * Ejemplo de una clase que no cumple el LSP.
 * @author weltonvs
 */
public class SuperClase {
    
    private int valor;

    public SuperClase(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public int suma(int valor){
        return this.valor + valor;
    }
    
}
