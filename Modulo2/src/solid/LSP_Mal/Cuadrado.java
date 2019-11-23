
package solid.LSP_Mal;

/**
 * Clase Cuadrado
 * Esta clase no cumple con el principio LSP.
 * @author weltonvs
 */
public class Cuadrado extends Rectangulo{

    /**
     * Constructor de Cuadrado
     * @param alto
     * @param ancho 
     */
    public Cuadrado(int alto, int ancho) {
        super(alto, ancho);
    }

    
    @Override
    public void setAncho(int ancho) {
        super.setAncho(ancho);
        super.setAlto(ancho);
    }

    @Override
    public void setAlto(int alto) {
        super.setAlto(alto);
        super.setAncho(alto);
    }
}
