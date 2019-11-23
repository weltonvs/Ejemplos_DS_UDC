
package paquete_a;

/**
 * Ejemplo de clase que pertenece al mismo paquete_a.
 * @author weltonvs
 */
public class ClaseMismoPaquete {
    public void metodoDeAcceso_2(){
        Clase c = new Clase();
        //c.privado = 1;//No es válido porque ese atributo es privado en la clase Clase.
        c.protegido = 2;//Se permite porque esta en el mismo paquete.
        c.paquete = 3;//Se permite porque esa clase pertenece al mismo paquete.
        c.publico = 4;//Se permite porque el atributo de la clase Clase es público.
    }
}



