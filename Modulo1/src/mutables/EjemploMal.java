
package mutables;

/**
 *
 * @author welto
 */
public class EjemploMal {
    
    public static void main(String[] args){
        Cliente cJuan = new Cliente("Juan", 1000);//Nuevo cliente con 1000€
        Cuenta c = cJuan.getCuenta();//Una variable cualquiera tiene acceso a referencia de la cuenta de cJuan.
        c.retirada(1000);//Como es mutable, se permite modificar el contenido de la cuenta.
        
        System.out.println("Saldo de Juan:" + cJuan.getCuenta().getBalance());
    }
    
}


