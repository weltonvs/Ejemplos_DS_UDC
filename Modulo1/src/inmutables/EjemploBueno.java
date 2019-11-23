
package inmutables;

/**
 * Uso de la clase inmutable.
 * @author weltonvs
 */
public class EjemploBueno {
    public static void main(String[] args){
        Cliente cJuan = new Cliente("Juan", 1000);//Nuevo cliente con 1000€
        Cuenta c = cJuan.getCuenta();//Una variable cualquiera recibe una copia de la cuenta de cJuan.
        c.retirada(1000);//Como es inmutable, solo se modifica la copia, pero la cuenta original sigue igual.
        
        System.out.println("Saldo de Juan:" + cJuan.getCuenta().getBalance());
        System.out.println("Saldo de la copia de Juan:" + c.getBalance());
    }
}


