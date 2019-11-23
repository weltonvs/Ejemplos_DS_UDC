
package tema2;

/**
 * Ejemplo del primer intento de uso de enumerado en Java
 * Ese ejemplo funciona, pero poco aclaratorio.
 * @author weltonvs
 */
public class Calificacion_1 {
    public static final int MATRICULA = 4;
    public static final int SOBRESALIENTE = 3;
    public static final int NOTABLE = 2;
    public static final int APROBADO = 1;
    public static final int SUSPENSO = 0;
    public static final int NO_PRESENTADO = -1;
    
    public int introduceCalificacion(int calificacion){
        return calificacion;
        
    }
    public static void main(String[] args){
        Calificacion_1 p = new Calificacion_1();
        int valor_1 = p.introduceCalificacion(Calificacion_1.APROBADO);//Forma correcta de utilizar.
        int valor_2 = p.introduceCalificacion(10);//Es valido, pero al no aclarar ese tipo de enumerado no funciona.Error.
        System.out.println("Valor 1:" + valor_1);
        System.out.println("Valor 2:" + valor_2);
    }
}





