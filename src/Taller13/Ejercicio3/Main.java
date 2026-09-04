package Taller13.Ejercicio3;

    public class Main {
        public static void main(String[] args) {
            Figura figura1 = new Figura() {}; // clase anónima, ya que Figura no tiene métodos abstractos
            System.out.println("Área: " + figura1.calcularArea());
        }
    }

