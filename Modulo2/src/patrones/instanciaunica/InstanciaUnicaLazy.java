
package patrones.instanciaunica;

/**
 * Clase InstanciaUnica
 *  Ejemplo de Patrón Instancia Única con inicialización tardía.
 * Con ese ejemplo puede ser problemático con varios hilos de ejecución.
 * @author weltonvs
 */
public class InstanciaUnicaLazy {
    
    //Atributo privado estatico con el nombre de la clase.
    //No es final porque se inicializa al llamar que devuelva una instancia de la clase.
    //Al inicializar nulo puede que al crear varios hilos puede coincidir con oobjetos distintos.
    private static InstanciaUnicaLazy instanciaUnicaLazy = null;
    
    /**
     * Constructor privado
     */
    private InstanciaUnicaLazy(){
        //Vacio.
    }
    
    /**
     * Método que devuelve una única instancia.
     * @return instanciaUnicaLazy
     */
    public static InstanciaUnicaLazy getInstanciaUnicaLazy(){
        //Verificar si ya existe una instancia creada.
        if(instanciaUnicaLazy == null){
            instanciaUnicaLazy = new InstanciaUnicaLazy();
        }         
        return instanciaUnicaLazy;
    }
    
}
