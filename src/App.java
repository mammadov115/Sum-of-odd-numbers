import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number, total = 0;

        do {
            System.out.println("Enter number:");
            number = input.nextInt();

            if (number % 2 == 1) {
                total+=number;
            }

        } while (number > 0);

        System.out.println("Sum of entered odd numbers:");
        System.out.println(total);
    }
}
