
package patronestrategia;

/**
 * Clase OrdenacionBurbuja
 * Patrón Estrategia.
 * Parte de Estrategia Concreta A del patrón estrategia.
 * @author weltonvs
 */
public class OrdenacionBurbuja implements AlgoritmoOrdenacion{

    @Override
    public void ordena(Vector v) {
        int i, j, aux;
        for (i = 0; i < v.longitud() - 1; i++) {
            for (j = 0; j < v.longitud() - i - 1; j++) {
                if (v.obtieneValor(j + 1) < v.obtieneValor(j)) {
                    aux = v.obtieneValor(j + 1);
                    v.introduceValor(j + 1, v.obtieneValor(j));
                    v.introduceValor(j, aux);
                }
            }
        }
    }
}
