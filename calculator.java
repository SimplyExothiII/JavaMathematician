import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        // Creating a new scanner object.
        try (Scanner object = new Scanner(System.in)) {
            System.out.println("What do you want to do?");
            System.out.println("Divide(1), Multiply(2), Subtract(3), Add(4), Modul(5): ");
            System.out.println("Type in a number, not text.");
            int choose = object.nextInt();
             if (choose == 1) {
                System.out.println("Enter what you want to divide: ");
                Long number1 = object.nextLong();
                System.out.println("Divide by: ");
                Long number2 = object.nextLong();
                System.out.println("Result: " + number1 / number2);
            } else if (choose == 2) {
                System.out.println("Enter what you want to multiply: ");
                Long number3 = object.nextLong();
                System.out.println("Multiply by: ");
                Long number4 = object.nextLong();
                System.out.println("Result: " + number3 * number4);
            } else if (choose == 3) {
                System.out.println("Enter what you want to substract: ");
                Long number5 = object.nextLong();
                System.out.println("Substract by: ");
                Long number6 = object.nextLong();
                Long resultsub = number5 - number6;
                System.out.println("Result: " + resultsub);
            } else if (choose == 4) {
                System.out.println("Enter what you want to add: ");
                Long number7 = object.nextLong();
                System.out.println("Add to: ");
                Long number8 = object.nextLong();
                System.out.println("Result: " + number7 + number8);
            } else if (choose == 5) {
                System.out.println("Enter what you want to modul: ");
                Long number9 = object.nextLong();
                System.out.println("Modul by: ");
                Long number10 = object.nextLong();
                System.out.println("Result: " + number9 % number10);
            }
        }
    }
}
