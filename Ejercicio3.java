import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int totalSegundos = entrada.nextInt();

        int dias = totalSegundos / 86400;
        totalSegundos = totalSegundos % 86400;

        int horas = totalSegundos / 3600;
        totalSegundos = totalSegundos % 3600;

        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;

        System.out.println(dias + " : " + horas + " : " + minutos + " : " + segundos);

        entrada.close();
    }
}