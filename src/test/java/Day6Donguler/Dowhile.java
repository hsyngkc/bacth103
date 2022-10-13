package Day6Donguler;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass;
        boolean askpassword = true;

        do {
            System.out.println( "Şifre Giriniz:");
            pass = input.nextInt();
            if (pass ==123) {
                System.out.println("Doğru");
                askpassword = false ; }
            else {
                System.out.println("Yanlış");
            }
    } while (askpassword);
}}
