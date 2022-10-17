package day5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat = input.nextInt();

        if (mat < 0 || mat > 100) {
            System.out.println("Girdiğiniz değerler 0 ile 100 arasında olmalıdır.");
            System.out.println("Matematik Notunuz:");
            mat = input.nextInt();
        }

        System.out.print("Fizik Notunuz:");
        fizik = input.nextInt();

        if (fizik < 0 || fizik > 100) {
            System.out.println("Girdiğiniz değerler 0 ile 100 arasında olmalıdır.");
            System.out.println("Fizik Notunuz:");
            fizik = input.nextInt();
        }

        System.out.print("Türkçe Notunuz:");
        turkce = input.nextInt();

        if (turkce < 0 || turkce > 100) {
            System.out.println("Girdiğiniz değerler 0 ile 100 arasında olmalıdır.");
            System.out.println("Turkce Notunuz:");
            turkce = input.nextInt();
        }

        System.out.print("Kimya Notunuz");
        kimya = input.nextInt();

        if (kimya < 0 || kimya > 100) {
            System.out.println("Girdiğiniz değerler 0 ile 100 arasında olmalıdır.");
            System.out.println("Kimya Notunuz:");
            kimya = input.nextInt();
        }

        System.out.print("Müzik Notunuz:");
        muzik = input.nextInt();

        if (muzik < 0 || muzik > 100) {
            System.out.println("Girdiğiniz değerler 0 ile 100 arasında olmalıdır.");
            System.out.println("Müzik Notunuz:");
            muzik = input.nextInt();
        }

        double avarage = ((mat + fizik + turkce + kimya + muzik) / 5);
        if (avarage <= 54) {
            System.out.println("Sınıfta Kaldınız!");

        } else {
            System.out.println("Tebrikler Sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız: " + avarage);
    }
}