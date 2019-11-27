
package patrones.observador;

/**
 * Clase App.
 * Clase utilizada para probar el patrón observador.
 * @author weltonvs
 */
public class App {
    
    public static void main(String[] args){
        Piscina piscinaMunicipal = new Piscina(75);
        AlarmaPiscina alarmaSocorrista = new AlarmaPiscina();
        AlarmaPiscina alarmaBomberos = new AlarmaPiscina();
        
        //Registra dos observadores en la piscinaMucipal para vigilar el nivel de agua.
        piscinaMunicipal.addObserver(alarmaBomberos);
        piscinaMunicipal.addObserver(alarmaBomberos);
        
        System.out.println("Nivel de agua es " + piscinaMunicipal.getNivel());
        piscinaMunicipal.abreGrifo(10);//Modifico el nivel de agua.
        
        System.out.println("Nivel de agua es " + piscinaMunicipal.getNivel());
        piscinaMunicipal.abreGrifo(35);//Modifico el nivel de agua.
        
        System.out.println("Nivel de agua es " + piscinaMunicipal.getNivel());
        piscinaMunicipal.quitaTapon(100);//Modifico el nivel de agua.
        
    }
    
}
