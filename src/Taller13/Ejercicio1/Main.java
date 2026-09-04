package Taller13.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(5, 4);
        Triangulo triangulo1 = new Triangulo(6, 3);

        System.out.println("Área del rectángulo: " + rectangulo1.calcularArea());
        System.out.println("Área del triángulo: " + triangulo1.calcularArea());
    }
}
