package Taller11.Ejercicio2;

public class Vendedor extends Empleado {
    private double salarioBase;
    private double ventasTotales;
    private double comisionPorcentaje;

    public Vendedor(String nombre, double salarioBase, double ventasTotales, double comisionPorcentaje) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.ventasTotales = ventasTotales;
        this.comisionPorcentaje = comisionPorcentaje;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (ventasTotales * comisionPorcentaje / 100);
    }
}