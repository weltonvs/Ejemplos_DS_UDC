
package paquete_a;

/**
 * Ejemplo de clase que pertenece al paquete_a.
 * @author weltonvs
 */
public class Clase {
    private int privado;
    protected int protegido;
    int paquete;
    public int publico;
    
    public void metodoDeAcceso_1(){
        Clase c = new Clase();
        c.privado = 1;
        c.protegido = 2;
        c.paquete = 3;
        c.publico = 4;
    }
}


