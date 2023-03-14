package librerias.estructurasDeDatos.deDispersion;

import librerias.estructurasDeDatos.modelos.Map;

public class TablaHash<C, V> implements Map<C, V>{

    private EntradaHash<C, V> array[];
    private int talla;
     /** inserta la Entrada (c,v) en un Map y devuelve null; si ya
     *  existe una Entrada de Clave c en el Map, devuelve su valor 
     *  asociado y lo substituye por v (o actualiza la Entrada
     */

    @SuppressWarnings("unchecked")
    public void TablaHash(int capacidad){
        capacidad = (int) (talla/0.75);
        array = new EntradaHash[capacidad];
        talla= 0;
    }

    public int indexHash(C c){
        int res = c.hashCode() % array.length;
        if(res < 0) res += array.length;
        return res;
    }

    public V insertar(C c, V v){
        if()
        if(talla < array.length){
            array[talla]= new EntradaHash<C, V>(c, v);
        }
        
    }
    
    /** elimina la Entrada con Clave c de un Map y devuelve su 
     *  valor asociado, null si no existe una Entrada con dicha clave
     */
    public V eliminar(C c){
        if (c.inde)
    }
    
    /** devuelve el valor asociado a la clave c en un Map,
     *  null si no existe una Entrada con dicha clave
     */
    public V recuperar(C c);
    
    /** comprueba si un Map esta vacio */
    public boolean esVacio();
    
    /** devuelve la talla, o numero de Entradas, de un Map */
    public int talla();
    
    /** devuelve una ListaConPI con las talla() Claves de un Map */
    public ListaConPI<C> claves();
}
}
