
package solid.ISP_Bien;

/**
 * Interface Trabajador
 * Principio de segregación de interfaces
 * @author weltonvs
 */
public class SuperTrabajador implements Trabajador, Comedor {

    @Override
    public void trabaja() {
        System.out.println("Trabajando MUCHO...");
    }

    /**
     * Método default del intefaz Trabajador.
     * Se puede volver a rescribirlo y cambiar la implemantación
     * estandar que proporciona el interfaz.
     */
    @Override
    public void proyectoPersonal() {
        System.out.println("Conseguir la paz mundial...");
    }

    @Override
    public void come() {
        System.out.println("Comiendo POCO...");
    }
}
