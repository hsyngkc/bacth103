package patika;

import java.util.Scanner;

public class harmonikSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n,result=0;
        System.out.print("n değerini giriniz: ");
        n = input.nextDouble();

        for (double i = 1; i <= n; i++) {

            result += (1/i);
        }
        System.out.println(result);
    }
}
