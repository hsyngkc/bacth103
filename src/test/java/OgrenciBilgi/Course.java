package OgrenciBilgi;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course (String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;

    }
    void addTeacher ( Teacher teacher){
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
        }else {

        }
    }
    void printTeacher(){

    }
}
