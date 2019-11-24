
package solid.DIP_Mal;

/**
 * Clase Cliente
 * Principio de Inversión de Dependencia - DIP
 * Utilizando la inyección de dependencia.
 * Esta clase no cumple con el Principio de Inversión de Dependencia - DIP.
 * El error esta relacionado con el constructor que no recibe el parámetro de la dependencia.
 * Si futuramente aparece otro tipo de servicio, esta clase no esta preparada para ello.
 * @author weltonvs
 */
public class Cliente {
    //Referencia interna al servicio utilizado por este cliente.
    private Servicio servicio;

    public Cliente() {
        //Especifique una implementación específica en el constructor en lugar 
        //de usar la inyección de dependencia.
        this.servicio = new Servicio("Conexión a BD.");
    }
    //Método dentro de este cliente que usa el servicio.
    public String greet(){
        return "Hello " + servicio.getNombre();
    }
    
}
