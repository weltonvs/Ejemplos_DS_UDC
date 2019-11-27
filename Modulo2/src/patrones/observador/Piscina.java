
package patrones.observador;

import java.util.Observable;

/**
 * Clase Piscina que es una extención de la clase Observable de Java.
 * Patrón Observador.
 * Observable es la parte Sujeto del patrón y Piscina es el SujetoConcreto
 * @author weltonvs
 */
public class Piscina extends Observable{
    public static final int MAX = 100;
    public static final int MIN = 50;
    
    public enum Limite{NIVEL_MAX, NIVEL_MIN};
    private int nivel;

    public Piscina(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
    
    
    
    public void abreGrifo(int incremento){
        nivel += incremento;
        if(nivel > MAX){
            setChanged();
            notifyObservers(Limite.NIVEL_MAX);//Avisa a los observadores que el nivel ha llegado al nivel máximo.
        }
    }
    
    public void quitaTapon(int decremento){
        nivel -= decremento;
        if(nivel < MIN){
            setChanged();
            notifyObservers(Limite.NIVEL_MIN);//Avisa a los observadores que el nivel ha llegado al nivel mínimo.
        }
    }
}