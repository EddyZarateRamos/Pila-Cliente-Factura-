import java.util.Scanner;

public class PrincipalClienteFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pila pila = new Pila();
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el nombre del cliente " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido del cliente " + (i + 1) + ": ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese la edad del cliente " + (i + 1) + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ingrese elnúmero de la factura " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            System.out.print("Ingrese el monto de la factura " + (i + 1) + ": ");
            double monto = scanner.nextDouble();
            scanner.nextLine();
            Cliente cliente = new Cliente(nombre, apellido, edad);
            Factura factura = new Factura(numero, monto);
            pila.push(cliente, factura);
            pila.mostrar();
            System.out.println("_____________________________________________");
        }
    }
}
