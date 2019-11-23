
package tema3_coaccion;

/**
 * Ejemplo de uso del polimorfismo de inclusión. Tema 3 - DS
 * Página 115.
 * @author weltonvs
 */
public class Polimorfismo {
    public static void main(String[] args){
        Perro p = new Perro();// Perro hereda de Animal.
        if(p instanceof Perro) System.out.println("p es un Perro");
        if(p instanceof Animal) System.out.println("p es un Animal");
        
        //Asignando una clase hija (Perro) a la clase padre(Animal)
        Animal a = new Perro();
        if(a instanceof Perro) System.out.println("a es un Perro");
        if(a instanceof Animal) System.out.println("p es un Animal");
    }
}

// Creando las clases que se necesita para ejecutar el programa.
// Clase Animal.
class Animal{
    
}

// Clase Perro que se extiende de Animal.
class Perro extends Animal{
    
}


