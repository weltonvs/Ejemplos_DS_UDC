
package pildorasinformaticas;

/**
 *
 * @author weltonvs
 */
public class UsoTallas {
    enum Talla {MINI,MEDIANO,GRANDE,MUY_GRANDE};
    public static void main(String[] args){
        Talla s = Talla.MUY_GRANDE;
        System.out.println("La talla es " + s);
    }
}
