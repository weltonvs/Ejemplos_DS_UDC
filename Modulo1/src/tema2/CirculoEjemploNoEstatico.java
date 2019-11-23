
package tema2;

/**
 * Clase Circulo - Utilizado para el ejemplo de atributos finales.
 * Constantes no estáticas
 * @author weltonvs
 */
public class CirculoEjemploNoEstatico {
    public int radio;
    public final double PI = 3.1416;
    
    public CirculoEjemploNoEstatico(int radio){
        this.radio = radio;        
    }
    
    public double areaCirculo(){
        return PI * radio * radio;
    }
}


