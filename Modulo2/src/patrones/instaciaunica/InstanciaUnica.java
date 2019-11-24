
package patrones.instaciaunica;

/**
 * Clase InstanciaUnica
 *  Ejemplo de Patrón Instancia Única con inicialización templana.
 * Con ese ejemplo no tenemos problema con la ejecución de varios hilos.
 * @author weltonvs
 */
public class InstanciaUnica {
    
    //Atributo privado estàtico final con el mismo nombre de la clase
    private static final InstanciaUnica instanciaUnica = new InstanciaUnica();// Todos los hilos acceden la misma instancia.
    
    //Constructor privado vacio.
    private InstanciaUnica(){
        
    }
    
    //El método debe ser estático, porque el atributo privado es estático.
    public static InstanciaUnica getInstanciaUnica(){
        return instanciaUnica;
    }
    
}
