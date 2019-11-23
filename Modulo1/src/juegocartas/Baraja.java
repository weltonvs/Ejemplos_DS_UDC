
package juegocartas;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Clase Baraja
 * @author weltonvs
 */
public class Baraja {
    /**
     * Atributos de la clase Baraja.
     */
    private final ArrayList<Carta> cartas;    
    /**
     * Constructor de la clase Baraja.
     */
    public Baraja() {
        cartas = new ArrayList<>(40);
        String[] palos = {"OROS", "PALOS", "COPAS", "ESPADAS", "BASTOS"};
        for(String p:palos){
            for(int i=1; i<=13;i++){
                cartas.add(new Carta(i,p));
            }
        }
    }
    /**
     * Método que devuelve una carta.
     * @param posicion int
     * @return Carta
     */
    public Carta getCarta(int posicion){
        return cartas.get(posicion);
    }    
    /**
     * Método para barajar la Baraja.
     */
    public void barajar(){
        Collections.shuffle(cartas);
    }
    /**
     * Método para implimir el contenido de Baraja.
     * @return String
     */
    @Override
    public String toString() {
        String salida="Baraja{\n";
        for(Carta c:cartas){
            salida = salida + " carta=" + c.getNumero() + " Palo=" + c.getPalo() + "\n";
        }
        return salida + "}\n";
    }
}
