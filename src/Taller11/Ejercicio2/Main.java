package Taller11.Ejercicio2;

public class Main {
        public static void main(String[] args) {
            Empleado gerente1 = new Gerente("Ana Torres", 2000000, 500000);
            Empleado vendedor1 = new Vendedor("Luis Gómez", 1200000, 3000000, 5);

            gerente1.mostrarDetalles();
            System.out.println();
            vendedor1.mostrarDetalles();
        }
}

