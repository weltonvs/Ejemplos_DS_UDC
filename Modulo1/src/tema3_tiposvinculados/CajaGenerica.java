
package tema3_tiposvinculados;

/**
 * Ejemplo de clase generica para tipos vinculados
 * Tema 3 de DS
 * Página 151
 * @author weltovs
 */
public class CajaGenerica<T>{
    private T objeto;
    
    /**
     * Método constructor de la clase genérica CajaGenerica.
     * @param objeto T
     */
    public CajaGenerica(T objeto){
        this.objeto = objeto;
    }
    
    /**
     * Método que devuelve el objeto almacenado en el atributo objeto
     * @return T Tipo parametrizado que almacena cualquier tipo de objeto.
     */
    public T getObjeto(){
        return objeto;
    }
    
    /**
     * Método que modifica el contenido del atributo objeto.
     * @param objeto T Tipo parametrizado que devuelve el cualquier tipo de objeto almacenado previamente.
     */
    public void setObjeto(T objeto){
        this.objeto = objeto;
    }
    
    public static void main(String[] args) {
        CajaGenerica<Integer> c1 = new CajaGenerica<>(5);
        CajaGenerica<Integer> c2 = c1;
        
        System.out.println(c1.getClass());// getClass esta en la clase Object
        System.out.println(c2.getClass());// getClass esta en la clase Object
        
        System.out.println(c1.equals(c2));// equals esta en la clase Object
    }    
}
