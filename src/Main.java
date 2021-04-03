import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int starts, end;

        System.out.print("Number of Starts: ");
        starts = scanner.nextInt();
        System.out.print("Number of Finishes: ");
        end = scanner.nextInt();

        System.out.println("Sum of consecutive numbers: " + sum(starts, end));
    }

    public static int sum(int starts, int end)
    {
        int total = 0;

        for (int i = starts; i < end; i++){
            total += i;
        }

        return total;
    }
}
