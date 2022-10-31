package patika;

import java.util.Scanner;

public class kombinasyonFormul {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double c, nf = 1.0 , rf = 1.0 , xf = 1.0;
        double n,r;

        System.out.print("N sayısını giriniz: ");
        n = input.nextDouble();

        System.out.print("r saysını giriniz: ");
        r = input.nextDouble();

       double i = 1.0, j = 1.0, k = 1.0;

        while (i <= n) {
            nf *= i;
            i++;
        }

        while (j <= r) {
            rf *= i;
            j++;
        }

        while (k <= (n-r)) {
            xf *= k;
            k++;
        }

        /*
         for (int i = 1; i <= n; i++) {
            nf = nf * i;
        }
        for (int j = 1; j <= r; j++) {
            rf = rf * j;
        }
        for (int k = 1; k <= (n - r); k++) {
            xf = xf * k;
        }
*/

            c = nf / (rf * xf);
        System.out.println("C (" +n+ ","+ r+ ")= " + c);
    }
}
