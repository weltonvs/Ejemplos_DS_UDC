
package ivan;

/**
 *
 * @author weltonvs
 */
public enum Calificacion {
    SUSPENSO(0),APROBADO(5),NOTABLE(10),NO_PRESENTADO(0);
    
    private final int valor;
    private Calificacion(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
};


