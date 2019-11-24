
package solid.ISP_Mal;

/**
 * Clase Trabajador
 * Principio de segregación de interfaces
 * Esta clase no cumple con ISP.
 * @author weltonvs
 */
public class Trabajador {
    private String nombre;

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void trabaja(){
        System.out.println("Trabajando...");
    }
    
    public void come(){
        System.out.println("Comiendo...");
    }
}
