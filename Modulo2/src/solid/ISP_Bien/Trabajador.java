
package solid.ISP_Bien;

/**
 * Interface Trabajador
 * Principio de segregación de interfaces
 * @author weltonvs
 */
public interface Trabajador {
    
    public void trabaja();
    /**
     * Este método esta implementado aqui en un interfaz porque desde Java 8 
     * se puede permitir hacer ese tipo de método sin la necesidad de implementarlos
     * en la clase que utiliza ese interface.
     * La implementación por defecto es obrigatoria.
     */
    public default void proyectoPersonal(){
        System.out.println("No tengo proyecto personal");
    }
    /**
     * Método estático que pertenece a la interfaz.
     * Actua como un método de clase.
     * @param t Trabajador
     */
    public static void describeTrabajador(Trabajador t){
        System.out.print("Me dedico a:");
        t.trabaja();
        System.out.print("Y mi proyecto personal es:");
        t.proyectoPersonal();
    }
    
}
