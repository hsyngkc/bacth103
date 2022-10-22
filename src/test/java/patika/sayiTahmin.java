package patika;
import java.util.Scanner;
import java.util.Random;

public class sayiTahmin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Sayı TahminOyununa Hoş Geldiniz!");
        System.out.println("Lütfen 1-100 arası Bir Sayı Giriniz: ");

        int tahmin = input.nextInt();
        int sayi = rnd.nextInt(101);
        int tekrar = 1;
         while ( tahmin != sayi) {
             if (tahmin < 0 || tahmin >100 ) {
                 System.out.println(" Lütfen 1-100 arası Bir Sayı Giriniz: ");
                 tahmin = input.nextInt();
             } else if ( tahmin < sayi ) {
                 System.out.println("Daha büyük bir sayı giriniz: ");
                 tahmin = input.nextInt();
         } else {
                 System.out.println("Daha küçük bir sayı giriniz: ");
                 tahmin = input.nextInt();
             }
             tekrar++;}
             System.out.println("Tebrikler," + tekrar+ ". tahminde kazandınız!");

    }
}
