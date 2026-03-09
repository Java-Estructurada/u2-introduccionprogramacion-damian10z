import java.util.Scanner;

class Ejercicio2 {
    public static double cuadrado(double n) {
        return n * n;
    }
}

public class DistanciaEuclidiana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;

        double sumaCuadrados = CalculadoraPro.cuadrado(dx) + CalculadoraPro.cuadrado(dy);
        double distancia = Math.sqrt(sumaCuadrados);

        System.out.println("Distancia: " + distancia);

        entrada.close();
    }
}
