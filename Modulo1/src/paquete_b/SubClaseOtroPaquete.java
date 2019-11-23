
package paquete_b;
import paquete_a.*;

/**
 *
 * @author weltonvs
 */
public class SubClaseOtroPaquete extends Clase {
     public void metodoDeAcceso_5(){
        Clase c = new Clase();
        //c.privado = 1;//No es válido porque ese atributo es privado en la clase Clase.
        //c.protegido = 2;//No es válido porque esa clase apesar de ser hija, pero pertenece a un paquete distinto.
        //c.paquete = 3;//No se permite porque esa clase pertenece a otro paquete.
        c.publico = 4;//Se permite porque el atributo de la clase Clase es público.
        
        SubClaseOtroPaquete scop = new SubClaseOtroPaquete();
        //scop.privado = 1;//No es válido porque ese atributo es privado en la clase Clase.
        scop.protegido = 2;//Se permite porque esa clase es hija apesar de pertenecer a un paquete distinto.
        //scop.paquete = 3;//No se permite porque esa clase pertenece a otro paquete.
        scop.publico = 4;//Se permite porque el atributo de la clase Clase es público. 
    }
}

