package juegocartas;

import java.util.Objects;

/**
 *
 * @author weltonvs
 */
public class Carta {
    /**
     * Métodos privados de Carta. 
     */
    private int numero;
    private String palo;    
    /**
     * Método constructor de Carta
     * @param numero int
     * @param palo String
     */
    public Carta(int numero, String palo){
        this.numero = numero;
        this.palo = palo;
    }
    /**
     * Método que devuelve un número de la carta.
     * @return int
     */
    public int getNumero() {
        return numero;
    }
    /**
     * Método que modifica el valor de la carta.
     * @param numero int
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * Método que devuelve el palo de la carta.
     * @return String
     */
    public String getPalo() {
        return palo;
    }
    /**
     * Método que permite modificar el palo de la carta.
     * @param palo 
     */
    public void setPalo(String palo) {
        this.palo = palo;        
    }
    /**
     * Método hashCode de carta.
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.numero;
        hash = 61 * hash + Objects.hashCode(this.palo);
        return hash;
    }
    /**
     * Método equals de carta.
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        return true;
    }
    
    
}