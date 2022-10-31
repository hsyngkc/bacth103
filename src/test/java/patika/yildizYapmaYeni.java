package patika;

import java.util.Scanner;

public class yildizYapmaYeni {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Basamak Sayısını Giriniz:");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((i * 2) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

