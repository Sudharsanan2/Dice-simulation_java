import java.util.Random;
import java.util.Scanner;

public class Dice_Simulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of dice: ");
        int User_input = input.nextInt();

        Random ran = new Random();
        System.out.println("Hey User! You rolled:");
        int Total = 0;
        int Computer_input;
        for (int i = 0; i < User_input; i++) {
            Computer_input = ran.nextInt(6) + 1;
            Total += Computer_input;
            System.out.print(Computer_input + " ");
        }
        System.out.println("\nTotal: " + Total);
    }
}
