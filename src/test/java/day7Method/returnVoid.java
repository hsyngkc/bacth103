package day7Method;

public class returnVoid {

    /*
    static int sum(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 4));
    }    */
    static void sum (int a, int b) {
        int result = a+b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        sum(4,5);
    }
}