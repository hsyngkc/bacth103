package patika;

import java.sql.SQLOutput;
import java.util.Scanner;

public class dortvebesKuvvet {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("Sınır Sayısını Giriniz: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i *= 4) {

                System.out.println(i);
        }
        System.out.println("++++++++++");

        for (int b = 1; b <= n; b *=5) {
            System.out.println(b);
        }

    }
}
