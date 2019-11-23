
package ivan;

import java.util.Scanner;

/**
 *
 * @author weltonvs
 */
public class EjecutarEnumerado {
    
    public static void main(String[] args){
        Calificacion calificacion ;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba la calificación obtenida(APROBADO,SUSPENSO,NOTABLE,NO_PRESENTADO:");
        String texto = entrada.nextLine().toUpperCase();
        
        calificacion = Enum.valueOf(Calificacion.class, texto);
        
        System.out.println("La calificación buscada es " + calificacion + " cuya nota es " + calificacion.getValor());
        
    }
    
    
    
    
}
