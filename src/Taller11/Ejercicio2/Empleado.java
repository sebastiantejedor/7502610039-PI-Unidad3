package Taller11.Ejercicio2;

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
