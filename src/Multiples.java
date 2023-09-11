public class Multiples {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i < 1000; i++) {

            boolean divby3 = i % 3 == 0;
            boolean divby9 = i % 5 == 0;

            if (divby9) {
                count++;
            }
            else if (divby3) {
                count++;
            }

        }
        System.out.println(count);
    }
}
