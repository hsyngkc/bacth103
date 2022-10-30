package patika;

public class asalSayi {
    public static void main(String[] args) {
        int k = 100, counter;
        for (int i = 1; i <= k; i++) {
            counter = 0;

            for (int l = 1; l < i; l++) {
                if (i % l == 0) counter++;

            }
            if (counter == 1) {
                System.out.println(i + " ");
            }

        }

    }
}
