package patika;

import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, total = 0, total2 = 0;

        System.out.print("Bir sayı giriniz:");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                total += i;
            }
        }
        // Tam bölen sayıların, toplamının yarısı eşitse olduğu için ikiye böldüm.

        if ((total/2) != n) {
            System.out.println(n + " Mükemmel Bir Sayı Değildir.");
        } else {
            System.out.println(n + " Mükemmel Bir Sayıdor.");
        }
    }
}
