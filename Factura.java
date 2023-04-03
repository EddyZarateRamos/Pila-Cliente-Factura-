class Factura {
    private int numero;
    private double monto;
    
    public Factura(int numero, double monto) {
        this.numero = numero;
        this.monto = monto;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public double getMonto() {
        return monto;
    }
    
    public String toString() {
        return "Factura " + numero + ", Monto: " + monto;
    }
}
