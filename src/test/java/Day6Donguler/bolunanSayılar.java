package Day6Donguler;
import java.util.Scanner;
public class bolunanSayılar {

        public static void main (String[]args){
            int k,c=0,sum=0;
            double average;
            Scanner input=new Scanner(System.in);
            System.out.print("Sayı giriniz: ");
            k= input.nextInt();
            for (int i=1; i<=k; i++){
                if (i%3==0 && i%4==0){
                    sum+=i;
                    i++;
                }
            }
            if (c==0)
            {
                System.out.println("3'e ve 4'e tam bölünebilen sayı yoktur.");
            }
            else {
                average=sum/c;
                System.out.println(k+" sayısına kadar olan 3'e ve 4'e tam bölünen \nSayıların ortalaması:"+average);
            }



    }
}
