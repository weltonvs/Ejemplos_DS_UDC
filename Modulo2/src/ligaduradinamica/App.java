
package ligaduradinamica;

/**
 * Ejemplo de la diaspositiva del tema 3 de Ds
 * Página 219
 * @author weltonvs
 */
public class App {
    public static void main(String[] args){
        Padre padre = new Hijo();
        padre.metodoEstatico();//Funciona, pero no es la forma correcta.
        Padre.metodoEstatico();//Funciona y es la forma correcta.
    }
}
