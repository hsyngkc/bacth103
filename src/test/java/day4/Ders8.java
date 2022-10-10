package day4;

import java.util.Scanner;

public class Ders8 {
    public static void main(String[] args) {
        System.out.println("herhangi bir sayı giriniz");
        Scanner s1 = new Scanner(System.in);
        int sayi = s1.nextInt();
       /* if (sayi == 1) {
            System.out.println("1 girdiniz");
        }
        if (sayi == 2) {
            System.out.println("2 girdiniz");
        }
        if (sayi == 3) {
            System.out.println("3 girdiniz");
        }
        if (sayi >=4) {
            System.out.println("3 ten büyük sayı girdiniz"); }
*/
        switch (sayi) {
            case(1): System.out.println("bir girdiniz"); break;
            case(2): System.out.println("iki girdiniz"); break;
            case(3): System.out.println("üç girdiniz"); break;
            default: System.out.println("3 ten büyük sayı"); break;
        }
    }
}
