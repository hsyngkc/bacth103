package patika;

import java.util.Scanner;

public class artik {public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    boolean artik;

    System.out.print("Yıl giriniz: ");
    int year = scanner.nextInt();

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                artik = true;
            } else {
                artik = false;
            }
        } else {
            artik = true;
        }
    } else {
        artik = false;
    }
    if (artik) {
        System.out.println(year + " bir artık yıldır ! ");
    } else {
        System.out.println(year + " bir artık yıl değildir ! ");
    }
}

