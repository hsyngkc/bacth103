package patika;

import java.util.Scanner;

public class kdvTutari {
    public static void main(String[] args) {
        double fiyat, kdv = 0.18, kdv1= 0.08, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Fiyat Giriniz: ");
        fiyat = input.nextDouble();

        kdvliTutar = fiyat < 1000 ? (fiyat * kdv + fiyat) : (fiyat * kdv1 + fiyat);

        System.out.println("KDV'li Fiyat: "+ kdvliTutar);


    }
}
