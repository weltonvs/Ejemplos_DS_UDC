
package ligaduradinaminafinal;

/**
 * Ejemplo de ligadura dinámica con métodos finales
 * Diaspositiva del tema 3 de DS - página 221 
 * @author weltonvs
 */
public class Hijo extends Padre {
    
    //Genera error de compilación, porque el mismo método de la clase padre es final.    
//    public final void metodoFinal(){ 
//        System.out.println("Hijo");
//    }
}
