package patika;

import java.util.Scanner;

public class ff {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz: ");
        int n = input.nextInt();
        for (int x = n-1; x>0  ; x--) {
        for ( int z = 9 ; z>=(x*2)-1; z-=2) {
            System.out.print("*"); }
}
        System.out.println();
    }


    }

