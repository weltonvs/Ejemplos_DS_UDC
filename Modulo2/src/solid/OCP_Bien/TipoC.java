
package solid.OCP_Bien;

/**
 * Clase TipoC heredera de Personal
 * Ejemplo del Principio Abierto-Cerrado OCP de SOLID.
 * @author weltonvs
 */
public class TipoC extends Personal{
    private int incremento;

    public TipoC(int incremento, int base, int anhos) {
        super(base, anhos);
        this.incremento = incremento;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }
    
    @Override
    public int sueldo(){
        return super.sueldo() + incremento;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        final TipoC other = (TipoC) obj;
        if (this.incremento != other.incremento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        aux = aux.substring(0, aux.length()-2);
        return aux + " TipoC{" + "incremento=" + incremento + "}}";
    }
}
