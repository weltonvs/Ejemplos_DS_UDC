
package tema2;

/**
 *
 * @author weltonvs
 */
public class ComparacionIdentidad {
    
    
    public static void main(String[] args){
        Caja obj_1 = new Caja();
        obj_1.setValor(5);
        Caja obj_2 = obj_1;
        obj_2.setValor(10);
        if(obj_1 == obj_2){
            System.out.println("Los objetos son identicos");
        } else {
            System.out.println("Los objetos no son identicos");
        }
        System.out.println("obj_1= " + obj_1.getValor());
        System.out.println("obj_2= " + obj_2.getValor());
    }
}


