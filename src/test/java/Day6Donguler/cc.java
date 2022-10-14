package Day6Donguler;
import java.util.Scanner;
public class cc {
    public static void main(String[] args) {
        Scanner not= new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik notunu giriniz:");
        mat = not.nextInt();

        System.out.print("Fizik notunu giriniz:");
        fizik = not.nextInt();

        System.out.print("Kimya notunu giriniz:");
        kimya= not.nextInt();

        System.out.print("Türkçe notonu girniz:");

        turkce= not.nextInt();

        System.out.print("Tarih notunu giriniz:");
        tarih = not.nextInt();

        System.out.print("Müzik  otunu giriniz:");
        muzik = not.nextInt();

        int toplam=(mat+ fizik+ kimya + tarih+ turkce+ muzik);

        double sonuc= toplam/6.0;
        System.out.println("Not ortalaması:"+ sonuc);

        String str = sonuc > 60 ? "Sınıfı geçti" :  "Sınıfta kaldı";
        System.out.println(str);



    }
}
