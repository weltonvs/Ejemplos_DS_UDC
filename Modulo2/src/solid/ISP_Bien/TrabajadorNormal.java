
package solid.ISP_Bien;

/**
 * Clase TrabajadorNormal
 * Principio de segregación de interfaces
 * @author weltonvs
 */
public class TrabajadorNormal implements Trabajador,Comedor{

    @Override
    public void trabaja() {
        System.out.println("Trabajando...");
    }

    @Override
    public void come() {
        System.out.println("Comiendo...");
    }
}