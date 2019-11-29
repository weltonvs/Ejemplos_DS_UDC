
package patrones.adaptador.herenciamultiple;

import java.util.Queue;
import java.util.Stack;

/**
 * Clase AdaptadorHerencia
 * Patrón Adaptador con herencia.
 * @author weltonvs
 */
public class AdaptadorHerencia extends Stack implements Queue{

    @Override
    public boolean offer(Object e) {
        push(e);
        return true;
    }

    @Override
    public Object remove() {
        if(empty()){
            return null;
        } else {
            return super.remove(this);
        }
    }

    @Override
    public Object poll() {
        if(empty()){
            return null;
        } else {
            return super.peek();
        }
    }

    @Override
    public Object element() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
