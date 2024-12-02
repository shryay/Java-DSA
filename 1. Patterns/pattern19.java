public class pattern19 {
    public static void main(String[] args) {
        int iniS = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
        }
        iniS = 2 * 5 - 2;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            iniS -= 2;
            System.out.println();
        }
    }
}