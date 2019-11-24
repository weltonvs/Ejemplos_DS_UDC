package solid.ISP_Bien;

/**
 * Clase Robot
 * Principio de segregación de interfaces
 * @author weltonvs
 */
public class Robot implements Trabajador{

    @Override
    public void trabaja() {
        System.out.println("Trabajando SIN DESCANSO...");
    }
}
