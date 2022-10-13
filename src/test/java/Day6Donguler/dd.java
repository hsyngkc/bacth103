package Day6Donguler;

import java.util.Scanner;
public class dd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        /* for (boolean run = true; run; ) {
            System.out.println("Sayı Giriniz:");
            sayi = input.nextInt();
            if (sayi < 0) {
                run = false;
                System.out.println( "Başarılı");
            }

        } */
        do {
            System.out.println("Sayı Giriniz:");
            sayi = input.nextInt();
        }        while ( sayi > 0 );
    }
}
