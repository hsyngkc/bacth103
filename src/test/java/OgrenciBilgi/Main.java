package OgrenciBilgi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "05424444444", "TRH");
        Teacher t2 = new Teacher("Hüseyin", "53555555", "FZK");
        Teacher t3 = new Teacher("Merve", "53555555", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);
        Course tarihsoz = new Course("Tarih Sözlü","101/1","TRHSZ");
        tarihsoz.addTeacher(t1);
        Course fiziksoz = new Course("Fizik Sözlü", "102/2","FZKSZ");
        fiziksoz.addTeacher(t2);
        Course biyosoz = new Course("Biyoloji Sözlü", "103/3", "BIOSZ");
        biyosoz.addTeacher(t3);

        Student s1 = new Student("Ahmet","123", "4", tarih,fizik,biyo,tarihsoz,fiziksoz,biyosoz);
        s1.addBulkExamNote(100,60,50);
        s1.addOralNote(80,90,70);
        s1.isPass();

        Student s2 = new Student("Mehmet", "534","4",tarih,fizik,biyo,tarihsoz,fiziksoz,biyosoz);
        s2.addBulkExamNote(40,50,30);
        s2.addOralNote(60,70,80);
        s2.isPass();
    }

}
