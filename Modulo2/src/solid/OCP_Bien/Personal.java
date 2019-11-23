
package solid.OCP_Bien;

/**
 * Clase abstracta Personal
 * Ejemplo del Principio Abierto-Cerrado OCP de SOLID.
 * @author weltonvs
 */
public abstract class Personal {
    private int base;
    private int anhos;

    public Personal(int base, int anhos) {
        this.base = base;
        this.anhos = anhos;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAnhos() {
        return anhos;
    }

    public void setAnhos(int anhos) {
        this.anhos = anhos;
    }
    
    public int sueldo(){
        return base + (1000 * anhos);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.base;
        hash = 13 * hash + this.anhos;
        return hash;
    }

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
        final Personal other = (Personal) obj;
        if (this.base != other.base) {
            return false;
        }
        if (this.anhos != other.anhos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Personal{" + "base=" + base + ", anhos=" + anhos + '}';
    }
    
    
}
