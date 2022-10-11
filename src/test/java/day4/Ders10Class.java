package day4;

public class Ders10Class{
    public static void main(String[] args) {
        Ders d1= new Ders("Java","enis",10);
        System.out.println(d1.DersIsmi);
        System.out.println(d1.hoca);
        System.out.println(d1.sayi);
        System.out.println(d1.DersIsmi + d1.sayi + " dersi " + d1.hoca + " tarafından veriliyor ");
    }
}
