import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number ");
        int number = input.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int og, rem, result = 0, n = 0;

        og = number;
        while (og != 0) {
            og /= 10;
            ++n;
        }

        og = number;
         while (og != 0) {
            rem = og % 10;
            result += Math.pow(rem, n);
            og /= 10;
        }
        return result == number;
    }
}
