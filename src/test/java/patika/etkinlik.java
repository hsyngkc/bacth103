package patika;

import java.util.Scanner;

public class etkinlik {
    public static void main(String[] args) {

        int a;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava Sıcaklığı Kaç Derece: ");
        a = input.nextInt();

        if (a < 5) {
            System.out.println("Kayak yapabilrisiniz.");
        } else if (a < 15) {
            System.out.println("Sinemaya gidebilrisiniz.");
        } else if (a < 25) {
            System.out.println("Piknik yapabilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirisiniz.");
        }

    }
}
