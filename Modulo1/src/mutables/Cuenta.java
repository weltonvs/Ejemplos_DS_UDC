/**
 * Ejemplo de clase mutable
 * es mutable porque permite modificar el valor del atributo privado.
 */
package mutables;

/**
 * Clase Cuenta.
 * @author weltonvs
 */
public class Cuenta {
    /**
     * Atributos
     */
    private int balance = 0;
    /**
     * Método constructor de la clase Cuenta.
     * @param cantidad int
     */
    public Cuenta(int cantidad){
        balance = cantidad;
    }
    /**
     * Método get que devuelve el valor del balance de la cuenta.
     * @return int
     */
    public int getBalance() {
        return balance;
    }
    /**
     * Método que permite hacer retirada de valor de la cuenta.
     * @param cantidad int
     */
    public void retirada(int cantidad){
        balance -= cantidad;
    }
    /**
     * Método que permite hacer ingreso en la cuenta.
     * @param cantidad int
     */
    public void ingreso(int cantidad){
        balance += cantidad;
    }    
}

