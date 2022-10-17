package Day6Donguler;
import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {
        String usurName, password, no, newPassword;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adı giriniz:");
        usurName = inp.nextLine();

        System.out.print("Paralo:");
        password = inp.nextLine();

        if (usurName.equals("src/test/patika/patika") && password.equals("java123")) {
            System.out.println("Giriş Yatınız!");
        } else {
            System.out.println("Bilgileriniz Yanlış");
            System.out.println("Kullanıcı Adınız veya Şifreniz Hatalı,Şifrenizi Sıfırlamak ister misiniz? : \nEvet ya da Hayır yazınız.");
        }
        no = inp.nextLine();
        if (no.equals("Hayır")) {
            System.out.println("Lütfen Sayfayı Yenileyiniz");
        }
         else if (no.equals("Evet")) {
            System.out.println("Lütfen yeni şifrenizi yazınız:");
            newPassword = inp.nextLine();
            System.out.println("Şifre başarıyla oluşturuldu");
        }

    }
}
