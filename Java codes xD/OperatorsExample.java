import java.util.Scanner;

public class OperatorsExample {
    int x;
    int y;

    public OperatorsExample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        OperatorsExample example = new OperatorsExample(x, y);

        // Arithmetic operator
        int sum = example.x + example.y;
        System.out.println("Sum: " + sum);

        // Increment operator
        example.x++;
        System.out.println("Incremented x: " + example.x);

        // Logical operator
        boolean result = (example.x > 0) && (example.y > 0);
        System.out.println("Both x and y are positive: " + result);

        // Relational operator
        result = example.x > example.y;
        System.out.println("x is greater than y: " + result);
    }
}