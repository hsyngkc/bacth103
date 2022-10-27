package patika;

import java.util.Scanner;

public class flyTicket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age, range, oneWay;
        double perkm = 0.10, total;

        System.out.print("Lütfen Gidelecek Mesafeyi KM cinsinden Yazınız: ");
        range = input.nextInt();

        System.out.print("Tek Yön ise 1, Gidiş Dönüş İse 2 yazınız: ");
        oneWay = input.nextInt();

        if (oneWay >= 3) {
            System.out.println("Hatalı Giriş" + "\n Tek Yön ise 1, Gidiş Dönüş İse 2 yazınız: ");
            oneWay = input.nextInt();
        } else {
        }
        System.out.print("Yaşınızı Giriniz: ");
        age = input.nextInt();

        if (age < 65 && age > 24) {
            if (oneWay < 2) {
                total = range * perkm;
                System.out.println("Tutar: " + total);
            } else {
                total = range * perkm - (range * perkm) * 0.20;
                System.out.println("%20 indirimli tutar: " + total*2);
            }
        } else if (age < 12) {
            if (oneWay < 2 ) {
                total = (range * perkm) / 2;
                System.out.println("%50 İndirimli tutar: " + total);
            } else {
                total = (range * perkm) / 2 - ((range * perkm)/2) * 0.20;
                System.out.println("%50 + %20 indirimli tutar: " + total*2);
            }
        } else if (age < 24 && age > 12) {
            if (oneWay < 2) {
                total = range * perkm - (range * perkm) * 0.10;
                System.out.println("%10 İndirimlli Tutar" + total);
            } else {
                total = range * perkm - (range * perkm) * 0.10 - (range * perkm - (range * perkm) * 0.10) * 0.20;
                System.out.println("%10 + %20 indirimli tutar: " + total*2);
            }
        } else {
            if (oneWay < 2) {
                total = range * perkm - (range * perkm) * 0.30;
                System.out.println("%30 indirimli Tutar:");
            } else {
                total = range * perkm - (range * perkm) * 0.30 - (range * perkm - (range * perkm) * 0.30 ) * 0.20;
                System.out.println("%30 + %20 indirimli tutar: " + total*2);
            }
        }

    }
}
