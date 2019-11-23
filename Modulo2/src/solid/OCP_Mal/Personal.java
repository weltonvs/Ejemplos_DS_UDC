
package solid.OCP_Mal;

/**
 * Clase Personal
 * Ejemplo de incumplimiento del OCP.
 * @author weltonvs
 */
public class Personal {
    private enum Tipo{TIPO_A, TIPO_B, TIPO_C};//Al utilizar enumerados, no posibilida la extensión futuramente.
    private int base;
    private int anhos;
    private int extras;
    private int numProyectos;
    private Tipo tipo;

    public Personal(int base, int anhos, int extras, int numProyectos, Tipo tipo) {
        this.base = base;
        this.anhos = anhos;
        this.extras = extras;
        this.numProyectos = numProyectos;
        this.tipo = tipo;
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

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }

    public int getNumProyectos() {
        return numProyectos;
    }

    public void setNumProyectos(int numProyectos) {
        this.numProyectos = numProyectos;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Método que devuelve el sueldo del personal.
     * Este método no esta preparado para un futuro tipo.
     * incumple el 2º prioncipio SOLID - Principio abierto-Cerrado - OCP.
     * @return 
     */
    public int sueldo(){
        int respuesta = 0;
        if(tipo == Tipo.TIPO_A){
            respuesta = (10000 * numProyectos);
        } else if(tipo == Tipo.TIPO_B){
            respuesta =  base +(1000 * anhos) + extras;
        } else if(tipo == Tipo.TIPO_C){
            respuesta =  base + (1000 * anhos);
        }
        
        return respuesta;
    }
}
