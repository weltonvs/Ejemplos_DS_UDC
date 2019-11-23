
package comodines;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase AppWild
 * Ejemplo de uso de comodines - WildCards
 * Ejemplo de la página MitoCode.
 * @author weltovs
 */
public class AppWild {
    /**
     * Método WildCard - Unbounded
     * Comodín sin límite.
     * @param lista 
     */
    public void listarUnBounded(List<?> lista){
        for(Object a: lista){
            if(a instanceof Persona){
                System.out.println(((Persona)a).getNombre());
            } 
        }
    }
    
    public void listarUpperBounded(List<? extends Persona> lista){
        for(Persona a: lista){
            System.out.println(a.getNombre());
        }
    }
    
    public void listarLowerBounded(List<? super Alumno> lista){
        for(Object a: lista){
            System.out.println(((Alumno)a).getNombre());
        }
    }
    
    public static void main(String[] args){        
        AppWild aw = new AppWild();       
        Alumno alumno1 = new Alumno("MitoCode");
        Alumno alumno2 = new Alumno("Jaime");
        Alumno alumno3 = new Alumno("Welton");          
        List<Alumno> lista = new ArrayList<>();        
        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(alumno3);
        System.out.println("Listar UnBounded");
        aw.listarUnBounded(lista);
        System.out.println("Listar LowerBounded");
        aw.listarLowerBounded(lista);
        System.out.println("Listar UpperBounded");
        aw.listarUpperBounded(lista);
        System.out.println("--- Fin ---");
        
    }
}
