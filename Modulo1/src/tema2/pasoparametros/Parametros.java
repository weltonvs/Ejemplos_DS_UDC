
package tema2.pasoparametros;
import inmutables.Cuenta;
/**
 * Ejemplo para demostrar el paso de parámetros de DS del tema 2.
 * @author weltonvs
 */
public class Parametros {
    public static void manipularCuenta(Cuenta c1){
        c1.ingreso(500);
        Cuenta c2 = new Cuenta(500);
        c1 = c2;
    }
    public static void main(String[] args){
        Cuenta c = new Cuenta(1000);
        manipularCuenta(c);
        System.out.println("Saldo=" + c.getBalance());
    }
}


