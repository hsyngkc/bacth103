package patika;

import java.util.Scanner;

public class cinZodyak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year, zod;
        String a = "Çin Zodyağı Burcunuz";

        System.out.print("LÜtfen Doğum Yılınızı Giriniz: ");
        year = input.nextInt();

        zod = year % 12;

        if (zod < 1) {
            System.out.println( a +" Maymun");
        } else if (zod < 2) {
            System.out.println(a + " Horoz");
        } else if (zod < 3) {
            System.out.println(a + " Köpek");
        } else if (zod < 4) {
            System.out.println(a + " Domuz");
        } else if (zod < 5) {
            System.out.println(a + " Fare");
        } else if (zod < 6) {
            System.out.println(a+ " Öküz");
        } else if (zod < 7) {
            System.out.println(a + " Kaplan");
        } else if (zod < 8) {
            System.out.println(a + " Tavşan");
        } else if (zod < 9) {
            System.out.println(a + " Ejderha");
        } else if (zod < 10) {
            System.out.println(a + " Yılan");
        } else if (zod < 11) {
            System.out.println(a + " At");
        } else {
            System.out.println(a+  " Koyun");
        }
    }
}
