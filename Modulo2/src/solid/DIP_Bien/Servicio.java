
package solid.DIP_Bien;

/**
 * Clase Servicio.
 * Principio de Inversión de Dependencia - DIP
 * Utilizando la inyección de dependencia.
 * @author weltonvs
 */
public class Servicio {
    private String nombre;

    public Servicio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
