import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        // Upper half of the diamond
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {// Loop for spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {// Loop for asterisks
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // lower half of the diamond
        for (int i = (n - 1); i >= 0; i--) {
            for (int j = 0; j < (n - i); j++) {// Loop for spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {// Loop for asterisks
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
