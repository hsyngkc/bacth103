package day4;

public class Ders7 {
    public static void main(String[] args) {
        boolean yUyelik = true;
        String ders = "JAVAS";
       /*
        if (ders == "JAVA" && yUyelik == true) {
            System.out.println("JAVA derslerimize hoş geldiniz");
        } else if (yUyelik != false) {
            System.out.println("JAVA derslermizden faydalanablirisiniz.");

        } else {
            System.out.println("sitemize üye olunuz");
        }

        */
        System.out.println((yUyelik==true) && (ders== "JAVA") ? "java dersine hoş geldiniz" :
                (yUyelik != true) ? "sitemize üye olun" :
                "java dersinden faydalana bilirsiniz");
    }
}