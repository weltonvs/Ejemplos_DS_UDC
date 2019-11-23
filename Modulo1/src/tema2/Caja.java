
package tema2;

/**
 * Clase Caja utilizado en el tema 2 de DS como ejemplo.
 * @author weltonvs
 */
public class Caja {
    //Atributos
    private int valor;    
    /**
     * Método get que devuelve el valor del atributo valor de la Caja.
     * @return int
     */
    public int getValor() {
        return valor;
    }
    /**
     * Método set que modifica el valor del atributo valor de la clase Caja.
     * @param valor 
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    /**
     * Método constructor 1 sin parámetro de entrada.
     */
    public Caja(){
        valor = 0;
    }
    /**
     * Método constructor 2 con un parámetro de entrada.
     * @param valor int
     */
    public Caja(int valor){
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    /**
     * Método para la comparación de igualdad
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        //Reflexividad
        if (this == obj) {
            return true;
        }
        //Uso de nulos
        if (obj == null) {
            return false;
        }
        //Simetria
        if (getClass() != obj.getClass()) {
            return false;
        }
        //Consistencia
        final Caja other = (Caja) obj;
        if (this.valor != other.valor) {
            return false;
        }
        return true;
    }
}
