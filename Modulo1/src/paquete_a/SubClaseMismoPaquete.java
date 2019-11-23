
package paquete_a;

/**
 * Ejemplo de subclase del mismo paquete
 * @author weltonvs
 */
public class SubClaseMismoPaquete extends Clase {
    public void metodoDeAcceso_3(){
        Clase c = new Clase();
        //c.privado = 1;//No es válido porque ese atributo es privado en la clase Clase.
        c.protegido = 2;//Se permite porque esa clase es hija y además esta en el mismo paquete.
        c.paquete = 3;//Se permite porque esa clase pertenece al mismo paquete.
        c.publico = 4;//Se permite porque el atributo de la clase Clase es público.
    }
}


