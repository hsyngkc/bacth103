package Day6Donguler;
import java.util.Scanner;
public class ciftSayi {
    public static void main(String[] args) {
        int k,i=1;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Giriniz: ");
         k= inp.nextInt();

         /*for (int i=1; i<=k ; i++){
             if (i % 2 == 0){
             System.out.println(i);}

          */

        while (i<=k) {
            if (i%2 == 0) {
                System.out.println(i);
            }
            i++;

        }


    }
}
