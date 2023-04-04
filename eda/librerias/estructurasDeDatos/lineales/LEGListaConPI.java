package librerias.estructurasDeDatos.lineales;
import librerias.estructurasDeDatos.modelos.ListaConPI;

public class LEGListaConPI<E> implements ListaConPI<E>{

    protected NodoLEG<E> pri, pi_ant, ult; 
	protected int talla;
    // En principio, una LEGListaConPI NO tendria una talla ...
    // PERO se incluye pensando en la futura reutilizacion del Modelo
    public LEGListaConPI(){
        pri = ult = pi_ant = new NodoLEG<E>(null);
        talla = 0;
        }
    // Metodos Modificadores del estado de una Lista
    /** Inserta e en una Lista antes del Elemento que ocupa su PI, 
     *  que permanece inalterado */
    public void insertar(E e){
        NodoLEG<E> nou = new NodoLEG<E>(e);
        
        nou.seg = pi_ant.seg;
        pi_ant.seg= nou;
        
        if(nou.seg == null){
            ult = nou;
        }
        
        talla++;
    }
   
    /** SII !esFin(): 
     *  elimina de una Lista el Elemento que ocupa su PI, 
     *  que permanece inalterado */
    public void eliminar(){
        if (pi_ant != ult){
            pi_ant.seg = pi_ant.seg.seg; 
            talla--;
        }
    } 
        // Metodos Modificadores del estado del PI de una Lista
    /** Situa el PI de una Lista en su inicio */
    public void inicio(){pi_ant = pri;}
    
    /** SII !esFin(): 
     *  avanza el PI de una Lista */
    public void siguiente(){
        if(pi_ant.seg != null){
            pi_ant = pi_ant.seg;
        }
    }
    
    /** Situa el PI de una Lista en su fin */
    public void fin(){pi_ant = ult;}
    
    // Metodos Consultores del estado de una Lista
    /** SII !esFin(): 
     *  obtiene el Elemento que ocupa el PI de una Lista */
    public E recuperar(){
        if(pi_ant.seg == null){
            return null;
        }
        return pi_ant.seg.dada;
    }
    
    /** Comprueba si el PI de una Lista esta en su fin */
    public boolean esFin(){return pi_ant == ult;}
    
    /** Comprueba si una Lista Con PI esta vacia */
    public boolean esVacia(){return talla==0;}
    
    /** Devuelve la talla, o numero de elementos, de una Lista */
    public int talla(){return talla;}

    public String toString(){
        String res = "";
        this.inicio();
        for(int i= 0; i < this.talla; i++){
            res += this.recuperar().toString() + " ";
            this.siguiente();
        }

        return res;

    }
    
}
