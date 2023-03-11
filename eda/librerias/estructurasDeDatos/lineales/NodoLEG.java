package librerias.estructurasDeDatos.lineales;

class NodoLEG<E> {
    E dada;
    NodoLEG<E> seg;
    // constructor
    NodoLEG(E dada, NodoLEG<E> seg) {
        this.dada = dada;
        this.seg = seg;
    }
    // un altre constructor
    NodoLEG(E dada) {
        this(dada, null);
    }
}