
package tema2;

/**
 * Enumerado Calificación del ejemplo del tema 2 de DS.
 * @author weltonvs
 */
public enum Calificacion {
    MATRICULA(10),
    SOBRESALIENTE(9),
    NOTABLE(7),
    APROBADO(5),
    SUSPENSO(0),
    NO_PRESENTADO(0);
    
    private int valor; 
    
    public int getValor(){
        return valor;
    }
    
    private Calificacion(int valor){
        this.valor = valor;
    }
}


