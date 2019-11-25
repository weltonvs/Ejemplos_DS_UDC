
package patronestrategia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase Vector
 * Patrón Estrategia
 * Ejemplo de clase de DS
 * @author weltonvs
 */
public class Vector {
    
    private List<Integer> datos = new ArrayList<>();

    /**
     * Constructor vacio.
     */
    public Vector() {
    }
    
    /**
     * Constructor con llenado de datos aleatorios de hasta valores
     * @param valores int
     */
    public Vector(int valores) {
        Random aleatorio = new Random();
        for(int i = 0; i < valores; i++){
            datos.add(aleatorio.nextInt(100));
        }
    }
    
    /**
     * Método que introduce un valor a la lista de datos.
     * @param valor int
     */
    public void introduceValor(int valor) {
        datos.add(valor);
    }
    
    /**
     * Método que introduce un valor a una posición concreta.
     * @param posicion int
     * @param valor int
     */
    public void introduceValor(int posicion, int valor){
        datos.set(posicion,valor);
    }
    
    /**
     * Método que returna el valor almacenado en una posición concreta.
     * @param posicion int
     * @return int
     */
    public int obtieneValor(int posicion) {
        return datos.get(posicion);
    }
    
    /**
     * Método que devuelve la longitud de la lista de datos.
     * @return int
     */
    public int longitud() {
        return datos.size();
    }
}
