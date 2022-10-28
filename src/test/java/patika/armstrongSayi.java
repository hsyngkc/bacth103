package patika;

import java.util.Scanner;

public class armstrongSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, basNumber=0 ;
        System.out.println("Sayı Giriniz: ");
        number = input.nextInt();
        int tempNumber = number;
        int basValue ;
        int result =0;
        int baspow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber=number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            baspow = 1;
            for (int i = 1; i <= basNumber; i++) {
                baspow *= basValue;
            }
            result += baspow;
            tempNumber /= 10;
        }
        System.out.println(result);

    }
}
