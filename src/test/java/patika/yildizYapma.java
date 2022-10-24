package patika;

import java.util.Scanner;

public class yildizYapma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz: ");
        int n = input.nextInt();
        int r=1;

       /*7 for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            } System.out.println();
        }
*/
        for (int x = n-1; x>0  ; x--) {
            System.out.println(x);
        }


    }
}
