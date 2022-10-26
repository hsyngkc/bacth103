package patika;

import java.sql.SQLOutput;
import java.util.Scanner;

public class daireAlanCevre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double r, area, circumference, a, result;
/*
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextDouble();

        alan = Math.PI*r*r;
        System.out.println("Alan: "+ area);

        cevre = 2* Math.PI*r;
        System.out.println("Çevre: "+ circumference);
*/
        // Ödev

        System.out.print("Yarı Çapı Giriniz: ");
        r = input.nextDouble();

        System.out.print("Merkez Açısı Ölçüsünü Giriniz: ");
        a = input.nextDouble();

        result = (Math.PI * (r * r) * a) / 360;
        System.out.println("Dilim Alanı: " + result);


    }

}
