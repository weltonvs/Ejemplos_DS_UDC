
package solid.ISP_Mal;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Empresa
 * Principio de segregación de interfaces
 * Esta clase no cumple con ISP.
 * @author weltonvs
 */
public class Empresa {
    private String nombre;
    List<Trabajador> trabajadores = new ArrayList<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void addTrabajador(Trabajador trabajador){
        trabajadores.add(trabajador);
    }
    
    public void trabajar(){
        for(Trabajador trabajador: trabajadores){
            trabajador.trabaja();
        }
    }
    
}
