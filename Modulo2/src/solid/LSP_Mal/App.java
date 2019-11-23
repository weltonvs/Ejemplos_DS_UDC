
package solid.LSP_Mal;

/**
 * Clase App
 * Principio de Sustiución de Liskov - LSP
 * Ejemplo de una clase que no cumple el LSP.
 * @author weltonvs
 */
public class App {
    
    public static void main(String[] args) {
        SuperClase clase = new SubClase(5);
        SubClase clase2 = new SubClase(5);
        
        System.out.println("El valor de una SuperClase es:" + clase.suma(6));
        System.out.println("El valor de una SubClase es:" + clase2.suma(6));
        
    }
}
