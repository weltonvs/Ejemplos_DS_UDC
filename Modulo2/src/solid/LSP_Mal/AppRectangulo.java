
package solid.LSP_Mal;

/**
 * Clase de prueba del rectangulo.
 * @author weltonvs
 */
public class AppRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(6, 5);
        Rectangulo cuadrado = new Cuadrado(5, 5);
        
        ClienteRectangulo.metodo(cuadrado);
        ClienteRectangulo.metodo(rectangulo);
        
    }
}
