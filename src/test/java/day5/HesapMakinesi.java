package day5;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz:");
        n1 = input.nextInt();
        System.out.print("ikinci Sayıyı : ");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        select = input.nextInt();
       /*if (select==1) {
           System.out.println("Sonuç :" + (n1+n2));
       }
       else if (select==2) {
           System.out.println("Sonuç : " +(n1-n2));
       } else if (select==3) {
           System.out.println("Sonuç: "+ (n1*n2));
           
       } else if (select==4) {
           if (n2 != 0) {
               System.out.println("Sonuç: " + (n1 / n2));
           } else {
               System.out.println("Bir sayı sıfıra bölünemez");
           }
       } else {
           System.out.println( "Yanlış bir seçim yaptınız!!");
       } */

        switch (select) {
            case (1):
                System.out.println("Sonuç: " + (n1 + n2));
                break;
            case (2):
                System.out.println("Sonuç: " + (n1 - n2));
                break;
            case (3):
                System.out.println("Sonuç:" + (n1 * n2));
                break;
            case (4):
                switch (n2) {
                    case (0):
                        System.out.println("Bir sayı sıfıra bölünemez");
                        break;
                    default: System.out.println("Sonuç: " + (n1 / n2));
                    break;
                }
            default:
                System.out.println("Yanlış bir seçim yaptınız.");
        }


    }
}
