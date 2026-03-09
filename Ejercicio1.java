import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Ingrese la cantidad");
        
        int monto = sc.nextInt();

        int b100 = monto / 100;
        monto = monto % 100;

        int b50 = monto / 50;
        monto = monto % 50;

        int b20 = monto / 20;
        monto = monto % 20;

        int m5 = monto / 5;
        monto = monto % 5;

        int m2 = monto / 2;
        monto = monto % 2;

        int m1 = monto / 1;

        System.out.println("Billetes $100: " + b100);
        System.out.println("Billetes $50:  " + b50);
        System.out.println("Billetes $20:  " + b20);
        System.out.println("Monedas $5:    " + m5);
        System.out.println("Monedas $2:    " + m2);
        System.out.println("Monedas $1:    " + m1);
        
        sc.close();
    }
}