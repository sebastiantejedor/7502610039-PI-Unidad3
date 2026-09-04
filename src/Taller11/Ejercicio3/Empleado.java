package Taller11.Ejercicio3;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario(); // vuelve a ser abstracto

    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }
}

/*
public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }
}
 */
