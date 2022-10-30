package patika;

import java.util.Scanner;

public class minMaxBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, i = 1, number;
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;

        System.out.print("Kaç tane sayı girecekseniz: ");
        n = input.nextInt();

        while (i <= n) {
            System.out.print(i + ". Sayıyı giriniz: ");
            i++;
            number = input.nextInt();

            if(min > number) min = number;
            else if(max < number) max = number;
        }


        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);
    }
}

