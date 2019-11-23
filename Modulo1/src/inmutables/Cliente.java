
package inmutables;

/**
 *
 * @author weltonvs
 */
public class Cliente {
    /**
     * Atributos
     */
    private String nombre;
    private Cuenta cuenta;
    /**
     * Método constructor de la clase Cliente.
     * @param nombre String
     * @param cantidad int
     */
    public Cliente(String nombre, int cantidad){
        this.nombre = nombre;
        cuenta = new Cuenta(cantidad);
    }
    /**
     * Método que duvuelve el nombre del cliente.
     * @return String
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Método que devuelve una copia de la cuenta del cliente.
     * @return Cuenta
     */
    public Cuenta getCuenta(){
        return new Cuenta(cuenta);
    }
}


