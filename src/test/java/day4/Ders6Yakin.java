package day4;
import java.util.Scanner;
public class Ders6Yakin {
    public static void main(String[] args) {
        System.out.print("Kaderdas Yazılıma Üyemisiniz:");
        Scanner input = new Scanner(System.in);
        String deger1 = input.nextLine();

        System.out.print("Hangi yazılım dili biliyorsunuz:");
        Scanner input2 = new Scanner(System.in);
        String deger2 = input.nextLine();

        if (deger1.contains("evet") && deger2.contains("java")) {
            System.out.println("Sitemize hoş geldiniz!!");
        } else if ( deger2.contains("hava")) {
            System.out.println("java eğitimini tamamlayın");
        } else {
            System.out.println("lütfen üye olunuz");

        }
    }
}
