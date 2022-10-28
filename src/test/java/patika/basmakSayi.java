package patika;

import java.util.Scanner;

public class basmakSayi {
    public static void main(String[] args) {

        int i, basNumber = 0, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        i = input.nextInt();

        while (i != 0) {
            basNumber = i % 10;
            i /= 10;
            result += basNumber;
        }
        System.out.println(result);
    }
}
