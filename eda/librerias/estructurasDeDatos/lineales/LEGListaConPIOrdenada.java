package librerias.estructurasDeDatos.lineales;

/**
 * Write a description of class LEGListaConPIOrdenada here.
 *
 * @author joan vidal carbo
 * @version (a version number or a date)
 */
public class LEGListaConPIOrdenada<E extends Comparable <E>> extends LEGListaConPI<E> {
    // instance variables - replace the example below with your own
   
    /** Inserta e en una Lista antes del Elemento que ocupa su PI, 
     *  que permanece inalterado */
    @Override
    public void insertar(E e){
        inicio();
        while(!esFin() && e.compareTo(recuperar()) > 0){
            siguiente();
        }
        super.insertar(e);
    
    }
}
