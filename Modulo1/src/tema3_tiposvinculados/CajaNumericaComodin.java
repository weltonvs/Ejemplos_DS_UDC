/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3_tiposvinculados;

/**
 *
 * @author weltonvs
 * @param <T>
 */
public class CajaNumericaComodin<T extends Number> {
    public T valor;
    
    /**
     * Método constructor de la clase genérica parametrizada CajaNumerica
     * @param valor T - Tipo genérico de almacenamiento que hereda de Number.
     */
    public CajaNumericaComodin(T valor) {
        this.valor = valor;
    }

    /**
     * Método que devuelve el objeto
     * @return T - Tipo genérico que hereda de Number.
     */
    public T getValor() {
        return valor;
    }

    /**
     * Método para almacenar objetos.
     * @param valor T - Tipo genérico que hereda de Number.
     */
    public void setValor(T valor) {
        this.valor = valor;
    }
    
    /**
     * Método que utiliza el método doubleValue() de Number.
     * @return double - Tipo primitivo double. 
     */
    public double reciploco(){
        return 1/valor.doubleValue();
    }
    
    /**
     * Método que utiliza el método intValue() de Number.
     * Devuelve la diferencia de valor double con el valor entero.
     * @return double - Tipo primitivo double.
     */
    public double fraccion(){
        return valor.doubleValue() - valor.intValue();
    }
    
    /**
     * Método que compara valores absolutos del valor del atributo con otro 
     * valor de otro objeto pasado como parámetro.
     * @param objeto CajaNumerica
     * @return 
     */
    public boolean absEquals(CajaNumericaComodin<? extends Number> objeto){
        return Math.abs(valor.doubleValue()) == Math.abs(objeto.valor.doubleValue());
    }
    
            
    public static void main(String[] args){
        //Integer y Double son subclases de Number.
        CajaNumericaComodin<Integer> n1 = new CajaNumericaComodin<>(5);
        CajaNumericaComodin<Double> n2 = new CajaNumericaComodin<>(5.0);
        
        System.out.println(n1.reciploco());
        System.out.println(n1.fraccion());
        System.out.println(n2.reciploco());
        System.out.println(n2.fraccion());
        
        //probar el método de comparación del contenido valor de CajaNumerica.
        System.out.println(n1.absEquals(n1));
        System.out.println(n1.absEquals(n2));//Ahora funciona
    }
}
