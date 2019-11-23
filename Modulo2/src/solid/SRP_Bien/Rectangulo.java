
package solid.SRP_Bien;

import java.util.Objects;

/**
 * Clase Rectangulo
 * Ejemplo de SRP bien construido.
 * @author weltonvs
 */
public class Rectangulo {
    private RectanguloGeometrico rectanguloGeometrico;

    public Rectangulo(RectanguloGeometrico rectanguloGeometrico) {
        this.rectanguloGeometrico = rectanguloGeometrico;
    }

    public RectanguloGeometrico getRectanguloGeometrico() {
        return rectanguloGeometrico;
    }

    public void setRectanguloGeometrico(RectanguloGeometrico rectanguloGeometrico) {
        this.rectanguloGeometrico = rectanguloGeometrico;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.rectanguloGeometrico);
        return hash;
    }

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
        final Rectangulo other = (Rectangulo) obj;
        if (!Objects.equals(this.rectanguloGeometrico, other.rectanguloGeometrico)) {
            return false;
        }
        return true;
    }
    
    /**
     * Método para dibujar un rectangulo.
     */
    public void dibujar(){
        System.out.println("Dibujar desde rectangulo");
    }
}
