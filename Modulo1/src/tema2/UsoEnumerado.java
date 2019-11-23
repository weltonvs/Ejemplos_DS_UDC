
package tema2;
 /**
 * Clase principal para el uso del tipo enumerado Calificacion del Tema-2 de DS
 * @author weltonvs
 */
public class UsoEnumerado {
    public static void main(String[] args){
        Calificacion nota;
        int valor = 10;
        String nombre = "sobresaliente";
        nombre = nombre.toUpperCase();
        nota = Enum.valueOf(Calificacion.class,nombre);
        System.out.println("Nota:" + nota.getValor());
        
        System.out.println("Utilizando toString:" + nota.toString());
        System.out.println("Utilizando toValue: " + Enum.valueOf(Calificacion.class,nombre).getValor());
    }
}


