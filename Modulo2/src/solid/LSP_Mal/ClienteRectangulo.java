
package solid.LSP_Mal;

/**
 * Clase ClienteRectangulo 
 * @author weltonvs
 */
public class ClienteRectangulo {
    
    public static void metodo(Rectangulo r){
        r.setAlto(5);
        r.setAncho(6);
        
        if(r.getAlto() * r.getAncho() == 30){
            System.out.println("Multiplicación correcta");
        } else {
            System.out.println("¡¡¡ ESTO ES IMPOSIBLE !!!");
        }
    }
}
