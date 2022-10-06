package day4;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Ders5Yakin {
    public static void main(String[] args) {

        System.out.println( "Lütfen yaşınızı giriniz:");
        Scanner input = new Scanner( System.in);
        int i = input.nextInt();
        if (i >17 ) {
            System.out.println("Ehilyet alabilrsiniz");}
        else {
            System.out.println("ehliyet için yetersiz yaş");
        }

    }
}