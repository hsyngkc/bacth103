package patika;

import java.util.Scanner;

public class manavKAsa {
    public static void main(String[] args) {
        double armut=2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0, a, e, d, m, p, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kg: ");
        a=input.nextDouble() * armut;

        System.out.print("Elma kg: ");
        e = input.nextDouble() * elma;

        System.out.print("Domates kg: ");
        d = input.nextDouble() * domates;

        System.out.print("Muz kg: ");
        m = input.nextDouble() * muz;

        System.out.print("Patlıcan kg.: ");
        p = input.nextDouble() * patlican;

        total = a+e+d+m+p;
        System.out.println("Taoplam Tutar: "+ total + " TL");
    }
}
