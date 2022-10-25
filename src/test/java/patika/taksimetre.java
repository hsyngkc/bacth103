package patika;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int acilis = 10, minumum = 20;
        double perkm = 2.20, tutar, a;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Kaç Kilometre Yol Gidilecek: ");
        a = girdi.nextDouble();
        tutar = a < 9.1 ? minumum : (a * perkm + acilis);

        System.out.println("Yol ücreti : " + tutar);
    }
}
