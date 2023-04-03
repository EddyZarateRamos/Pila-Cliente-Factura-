

class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Cliente(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String toString() {
        return nombre + " " + apellido + ", Edad: " + edad;
    }
}