public class pattern22 {
    public static void main(String[] args) {
        for (int i = 0; i < 2 * 4 - 1; i++) {
            for (int j = 0; j < 2 * 4 - 1; j++) {
                int top = i;
                int bottom = j;
                int right = (2 * 4 - 2) - j;
                int left = (2 * 4 - 2) - i;
                System.out.print(4 - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }
}