
package tema2;

/**
 *
 * @author weltonvs
 */
public class Comparacion {
    
    public static void main(String[] args){
        Caja obj_1 = new Caja(10);
        Caja obj_2 = new Caja(10);
        
        //Comparación de identidad
        if(obj_1 == obj_2){
            System.out.println("Los objetos son identicos");
        } else {
            System.out.println("Los objetos no son identicos");
        }
        
        //Comparación de igualdad.
        if(obj_1.equals(obj_2)){
            System.out.println("Los objetos son iguales");
        } else {
            System.out.println("Los objetos no son iguales");
        }
    }
}

