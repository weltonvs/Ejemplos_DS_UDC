
package tema3_Genericos;

/**
 * Ejemplo de uso de la clase CajaGenérica.
 * Tema 3 de DS.
 * Página 139.
 * @author weltonvs
 */
public class UsoCajaGenerica {
    
    public static void main(String[] args){
        CajaGenerica<Integer> c1 = new CajaGenerica<Integer>(5);
        CajaGenerica<Double> c2 = new CajaGenerica<Double>(5.0);

        //Imprimiendo el contenido de la clase genérica.
        System.out.println(c1.getObjeto().toString());
        System.out.println(c2.getObjeto().toString());
    }
}
