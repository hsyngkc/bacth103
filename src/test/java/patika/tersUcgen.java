package patika;

import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Basamak Sayısını Giriniz:");
        n = input.nextInt();

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