public class Reduce {
    public static void main(String[] args) {

        int steps = 0;
        int i = 100;
        while (i > 0) {
            boolean even = i % 2 == 0;

            if (even) {
                i /= 2;
            }

            else {
                i -= 1;
            }

            steps++;
        }
        System.out.println(steps);
    }
}
