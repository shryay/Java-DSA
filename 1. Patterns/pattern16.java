public class pattern16 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ((int) ('A' + i)) + " ");
            }
            System.out.println();
        }
    }
}