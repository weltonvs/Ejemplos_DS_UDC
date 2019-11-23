
package solid.OCP_Bien;

/**
 * Clase TipoB heredera de Personal
 * Ejemplo del Principio Abierto-Cerrado OCP de SOLID.
 * @author weltonvs
 */
public class TipoB extends Personal{
    private int extra;

    public TipoB(int extra, int base, int anhos) {
        super(base, anhos);
        this.extra = extra;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    @Override
    public int sueldo(){
        return super.sueldo() + extra;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 97 * hash + this.extra;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        
        if (!super.equals(obj)) {
            return false;
        }
        final TipoB other = (TipoB) obj;
        if (this.extra != other.extra) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        aux = aux.substring(0, aux.length()-2);
        return aux + " TipoB{" + "extra=" + extra + "}}";
    }
}
