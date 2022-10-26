package patika;

import java.util.Scanner;

public class vucutKitlleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float kg, cm, index;

        System.out.print("Kilo değerini giriniz (kg) : ");
        kg = input.nextInt();

        System.out.print("Boy değerini giriniz (cm) :");
        cm = input.nextInt();

        index = kg / cm * cm;

        System.out.print("Vücut kitle indexsiniz : " + index);


    }
}
