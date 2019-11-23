
package tema2;

/**
 * Clase Persona - Ejemplo de uso de un atributo estático.
 * @author weltonvs
 */
public class Persona {
    public int edad;
    public static int edadVoto = 18;
    
    public static void main(String[] args){
        Persona p1 = new Persona();
        
        System.out.println("Edad de voto: " + Persona.edadVoto);//Forma correcta de acceder a un atributo estático.
        System.out.println("Edad de voto:" + p1.edadVoto);//Se puede acceder desde el objeto.
    }
    
}
