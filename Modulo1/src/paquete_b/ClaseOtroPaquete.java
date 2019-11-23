
package paquete_b;
import paquete_a.*;

/**
 *
 * @author welto
 */
public class ClaseOtroPaquete {
    public void metodoDeAcceso_4(){
        Clase c = new Clase();
        //c.privado = 1;//No es válido porque ese atributo es privado en la clase Clase.
        //c.protegido = 2;//No es válido porque esa clase no es hija y además pertenece a un paquete distinto.
        //c.paquete = 3;//No se permite porque esa clase pertenece a otro paquete.
        c.publico = 4;//Se permite porque el atributo de la clase Clase es público.
    }
    
}

