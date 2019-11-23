
package solid.LSP_Mal;

/**
 * Clase Cliente de prueba.
 * Principio de Sustiución de Liskov - LSP
 * Ejemplo de una clase que no cumple el LSP.
 * @author weltonvs
 */
public class Cliente {
    
    public static void metodo(SuperClase s){
        s.setValor(5);
    }
}
