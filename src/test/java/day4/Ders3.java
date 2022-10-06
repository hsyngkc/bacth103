package day4;
import java.util.Scanner;
public class Ders3 {
    public static void main(String[] args) {
        System.out.print("5 ile çarpmak için değer gir:");
        Scanner input = new Scanner(System.in);
        int yazi = input.nextInt();
        System.out.print("sonuc:");
        System.out.print(yazi*5);
    }
}
