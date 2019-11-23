
package solid.LSP_Mal;

/**
 * Clase SubClase heredera de la SuperClase
 * Principio de Sustiución de Liskov - LSP
 * Ejemplo de una clase que no cumple el LSP.
 * @author weltonvs
 */
public class SubClase extends SuperClase{

    public SubClase(int valor) {
        super(valor);
    }
    
    public int multiplica(int valor){
        return this.getValor() * valor;
    }
    
}
