
package solid.OCP_Bien;

/**
 * Clase TipoA heredera de Personal
 * Ejemplo del Principio Abierto-Cerrado OCP de SOLID.
 * @author weltonvs
 */
public class TipoA extends Personal{
    private int numProyectos;

    /**
     * Método constructor.
     * @param numProyectos
     * @param base
     * @param anhos 
     */
    public TipoA(int numProyectos, int base, int anhos) {
        super(base, anhos);
        this.numProyectos = numProyectos;
    }

    public int getNumProyectos() {
        return numProyectos;
    }

    public void setNumProyectos(int numProyectos) {
        this.numProyectos = numProyectos;
    }
    
    @Override
    public int sueldo(){
        return (1000 * numProyectos);
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 29 * hash + this.numProyectos;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            return false;
        }
        final TipoA other = (TipoA) obj;
        if (this.numProyectos != other.numProyectos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        aux = aux.substring(0, aux.length()-2);
        return aux + " TipoA{" + "numProyectos=" + numProyectos + "}}";
    }
}
