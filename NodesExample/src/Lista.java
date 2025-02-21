public class Lista {
    Nodo first;
    public void list(){
        first = null;
    }

    public void IngresarDato(int dato){
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.sig = first;
        first = nuevo;
    }

    public void desplegar(){
        Nodo actual = new Nodo();
        actual = first;
        while(actual != null){
            System.out.println(actual.dato);
            actual = actual.sig;
        }
    }
}
