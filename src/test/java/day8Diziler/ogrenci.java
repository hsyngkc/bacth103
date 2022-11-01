package day8Diziler;

public class ogrenci {
    public static void main(String[] args) {
        String[] ogrenciler = new String[5];
        ogrenciler[0] = "Merve";
        ogrenciler[1] = "Kaan";
        ogrenciler[2] = "Zeynep";
        ogrenciler[3] = "Gökçe";
        ogrenciler[4] = "Hüseyin";
        for (String org : ogrenciler) {
            System.out.println(org);
        }
    }
}
