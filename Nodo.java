class Nodo {
    private Cliente cliente;
    private Factura factura;
    private Nodo siguiente;
    
    public Nodo(Cliente cliente, Factura factura) {
        this.cliente = cliente;
        this.factura = factura;
        this.siguiente = null;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public Factura getFactura() {
        return factura;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    public String toString() {
        return cliente.toString() + ", " + factura.toString();
    }
}