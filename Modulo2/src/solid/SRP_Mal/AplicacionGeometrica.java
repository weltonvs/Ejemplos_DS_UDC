
package solid.SRP_Mal;

import java.util.Objects;

/**
 * Clase AplicacionGeometrica
 * Ejemplo de SRP mal construido.
 * @author weltonvs
 */
public class AplicacionGeometrica {
    private String nombre;

    /**
     * Constructor de la clase AplicacionGeometrica
     * @param nombre 
     */
    public AplicacionGeometrica(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el nombre de la aplicacion geometrica.
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que modifica el nombre de la aplicación geométrica.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método toString
     * @return String
     */
    @Override
    public String toString() {
        return "AplicacionGeometrica{" + "nombre=" + nombre + '}';
    }

    /**
     * Método hashCode
     * @return int
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    /**
     * Método equals
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AplicacionGeometrica other = (AplicacionGeometrica) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
}
