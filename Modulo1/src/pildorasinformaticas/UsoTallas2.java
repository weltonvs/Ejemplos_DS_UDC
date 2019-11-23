
package pildorasinformaticas;

import java.util.Scanner;

/**
 *
 * @author weltonvs
 */
public class UsoTallas2 {
    
    enum Talla {
        
        MINI("S"),MEDIANA("M"),GRANDE("G"),MUY_GRANDE("XL");
        
        private final String abreveatura;
        private Talla(String abreveatura){
            this.abreveatura = abreveatura;
        }
        
        public String getAbreveatura(){
            return abreveatura;
        }
    };
       
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Escriba la talla (MINI,MEDIANA,GRANDE,MUY_GRANDE");
            String dato = entrada.nextLine().toUpperCase();
            
            Talla la_talla = Enum.valueOf(Talla.class, dato);
            System.out.println("Abreveatura= " + la_talla.getAbreveatura());
            
        }
    
}
