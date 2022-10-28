package patika;

import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n,k,total=1;
        System.out.print("Üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        k = input.nextInt();

       // int i=1;
        // while (i <= k) {
       //     total *= n;
        //   i++;
       // }

        // for kullanılarak yapımı

        for (int i =1; i <= k; i++) {
            total *= n;
        }
        System.out.println(total);

    }
}
