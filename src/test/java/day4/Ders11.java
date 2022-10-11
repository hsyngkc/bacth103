package day4;

public class Ders11 {
    public static void main(String[] args) {
        int liste [] = new int [5];
        liste[0] = 1231;
        liste[1]= 3141;
        liste [2]= 543;
        liste [3]= 234234;
        liste [4]= 65434;

        int liste2 [] = {1231,4543,45342,3425,64332,3242,4523};
        System.out.println(liste[3]);

        Ders d1 = new Ders("Java","enis",10);
        Ders d2 = new Ders("C#","huso",1);
        Ders d3 = new Ders("MSSQL","koca",5);
        Ders dersliste[]= {d1,d2,d3};
        System.out.println(d1.sayi+d2.hoca+d3.hoca);


    }
}
