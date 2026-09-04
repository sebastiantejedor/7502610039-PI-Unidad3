package Taller11.Ejercicio3;

    public class Main {
        public static void main(String[] args) {
            // Ya no se instancia Empleado directamente, se usa la subclase
            Empleado empleado1 = new Gerente("Ana", 2000000, 300000);
            empleado1.mostrarDetalles();
        }
    }

/*
error

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos"); // ERROR de compilación
        empleado1.mostrarDetalles();
    }
}

error: Empleado is abstract; cannot be instantiated
 */