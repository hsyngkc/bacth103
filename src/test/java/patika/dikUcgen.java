package patika;

import java.util.Scanner;

public class dikUcgen {
    public static void main(String[] args) {
        int a,b,c,d;
        double e;

   Scanner input= new Scanner(System.in);

        System.out.println( "1. Kenarın uzunluğunu giriniz: ");
        a = input.nextInt();
        System.out.println(" 2. Kenarın uzunluğunu giriniz: ");
        b = input.nextInt();
        System.out.println("3. Kenarın uzunluğunu giriniz: ");
        c = input.nextInt();

        d = (a+b+c)/2;
        e = Math .sqrt (d*(d-a)*(d-b)*(d-c));
        System.out.println("Alan : "+ e);

    }
}
