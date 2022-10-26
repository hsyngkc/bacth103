package patika;

import java.util.Scanner;

public class vucutKitlleIndeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, result;

        System.out.print("Lütfen Boyunuzu Giriniz: ");
        a = input.nextDouble()/100;

        System.out.print("Lütfen Kilonuzu Giriniz: ");
        b = input.nextDouble();

        result = b/(a*a);

        System.out.println("Vücüt Kitle İndeksiniz: " + result);
    }
}
