package Day6Donguler;

public class Dongu1 {
    public static void main(String[] args) {
        System.out.println("Program Başladı");
        int i=1;
        int k;
        
        while (i<=5 ) {
            System.out.println(i++);

            k=1;
            while (k<=10) {
                System.out.print((k++)+",");
            }
            System.out.println();
        }System.out.println( "Program Bitti");
    }
}
