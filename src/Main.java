import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int start, end;

        System.out.print("Number of Starts: ");
        start = scanner.nextInt();
        System.out.print("Number of Finishes: ");
        end = scanner.nextInt();

        System.out.println("Sum of consecutive numbers: " + sum(start, end));
    }

    public static int sum(int start, int end)
    {
        int total = 0;

        for (int i = start; i < end; i++){
            total += i;
        }

        return total;
    }
}
