package patika;

import java.util.Scanner;

public class kombinasyonFormul {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n, r, c, nf = 1, rf=1, xf=1;

        System.out.println("N sayısını giriniz: ");
        n = input.nextDouble();

        System.out.println("r saysını giriniz: ");
        r = input.nextDouble();

        for (double i = 1; i <= n; i++) {
            nf = nf * i;
        }
        for (double j = 1; j <= r; j++) {
            rf = rf * j;
        }
        for (double k = 1; k <= (n - r); k++) {
            xf = xf * k;
        }
        c = nf / (rf * xf);
        System.out.println("Kpmbinasyon Sonucu: " + c);
    }
}
