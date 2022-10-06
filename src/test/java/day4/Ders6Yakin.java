package day4;
import java.util.Scanner;
public class Ders6Yakin {
    public static void main(String[] args) {
        System.out.println("Yakın Kampüse Üyemisiniz:");
        Scanner input= new Scanner( System.in);
        String evet = input.nextLine();

        System.out.println( "hangi yazılım dili biliyorsunuz");
        Scanner input2 = new Scanner (System.in);
        String ahmet = input.nextLine();


        if (evet== evet && ahmet==ahmet) {
            System.out.println("Java derslerimize hoş geldiniz!!");
        }
            else if ( ahmet != ahmet) {
                System.out.println("Java derslermizden faydalanabilirsiniz");
            }
            else {
                System.out.println("Sitemize üye olarak çalışmaya başlayabilirsiniz");
            }
        }
    }
