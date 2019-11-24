
package solid.DIP_Bien;

/**
 * Clase Cliente
 * Principio de Inversión de Dependencia - DIP
 * Utilizando la inyección de dependencia.
 * @author weltonvs
 */
public class Cliente {
    //Referencia interna al servicio utilizado por este cliente.
    private Servicio servicio;

    public Cliente(Servicio servicio) {
        //guardar la referencia al servicio pasado dentro de este cliente
        this.servicio = servicio;
    }

    /**
     * Método que devuelve el servicio utilizado por el cliente.
     * @return 
     */
    public Servicio getServicio() {
        return servicio;
    }

    /**
     * Método que permite la modificación del servicio.
     * @param servicio 
     */
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    //Método dentro de este cliente que usa el servicio.
    public String greet(){
        return "Hello " + servicio.getNombre();
    }
}
