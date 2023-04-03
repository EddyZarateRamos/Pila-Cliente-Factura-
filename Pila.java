class Pila {
    private Nodo tope;
    
    public Pila() {
        tope = null;
    }
    
    public boolean estaVacia() {
        return tope == null;
    }
    
    public void push(Cliente cliente, Factura factura) {
        Nodo nuevoNodo = new Nodo(cliente, factura);
        if (estaVacia()) {
            tope = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(tope);
            tope = nuevoNodo;
        }
    }
    
    public Nodo pop() {
        if (estaVacia()) {
            return null;
        } else {
            Nodo nodoPop = tope;
            tope = tope.getSiguiente();
            return nodoPop;
        }
    }
    
    public void mostrar() {
        Nodo actual = tope;
        System.out.println("Pila:");
        while (actual != null) {
            System.out.println(actual.toString());
            actual = actual.getSiguiente();
        }
    }
}