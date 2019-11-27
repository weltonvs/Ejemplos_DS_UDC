
package patrones.observador;

import java.util.Observable;
import java.util.Observer;

/**
 * Clase AlarmaPiscina que es una extención de la clase Observer de Java.
 * Patrón Observador.
 * Observer es la parte Observador del patrón y AlarmaPiscina es el ObservadorConcreto.
 * @author weltonvs
 */
public class AlarmaPiscina implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        Piscina p = (Piscina) o;
        int cantidad;
        
        System.out.println("El nivel de la piscina es: " + p.getNivel());
        if(arg.equals(Piscina.Limite.NIVEL_MAX)){
            cantidad = Piscina.MAX - p.getNivel();
            System.out.println("Hay que VACIAR la cantidad de " + cantidad);
        } else if(arg.equals(Piscina.Limite.NIVEL_MIN)){
            cantidad = Piscina.MIN - p.getNivel();
            System.out.println("Hay que LLENAR la cantidad de " + cantidad);
        }
    }
    
}
