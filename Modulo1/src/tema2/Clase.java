
package tema2;

/**
 * Clase Clase como ejemplo de uso de atributos estáticos.
 * @author weltonvs
 */
public class Clase {
    public static int i;
    
    public static void main(String[] args){
        Clase c1 = new Clase();
        Clase c2 = new Clase();
        /**
         * Forma erronea y confusa de acceder a un atributo estático
         * Java permite que lo haga, pero no es una buena idea.
         */
        c1.i = 5;
        c2.i = 10;
        System.out.println("Forma erronea de acceder a un atributo estático, apesar de Jave permitir desde los objetos:");
        System.out.println("c1.i = " + c1.i);
        System.out.println("c2.i = " + c2.i);
        /**
         * Forma correcta de acceder a un atributo estático.
         */
        Clase.i = 5;
        Clase.i = 10;
        System.out.println("Forma correcta de utilizar un atributo estático:");
        System.out.println("Clase.i = " + Clase.i);
        System.out.println("Clase.i = " + Clase.i);
    }
}


