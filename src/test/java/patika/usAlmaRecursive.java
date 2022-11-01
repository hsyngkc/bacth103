package patika;

import java.util.Scanner;

public class usAlmaRecursive {
    static int power(int n, int k) {
        if (k == 0) {
            return 1;
        }
        return n * power(n, k-1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int n = input.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int k = input.nextInt();
        System.out.println("Sonuç: "+ power (n, k));

    }
}
