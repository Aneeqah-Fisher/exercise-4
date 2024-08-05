import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[100];
        int count = 0, sum = 0;

        System.out.println("Enter scores (negative number to end):");

        // Read scores
        while (true) {
            int score = input.nextInt();
            if (score < 0) break;
            if (count < 100) {
                scores[count++] = score;
                sum += score;
            }
        }

        if (count == 0) {
            System.out.println("No scores entered.");
            input.close();
            return;
        }

        // Calculate the average and counts
        double average = (double) sum / count;
        int aboveOrEqualCount = 0;

        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) aboveOrEqualCount++;
        }

        System.out.println("Average score: " + average);
        System.out.println("Number of scores above or equal to the average: " + aboveOrEqualCount);
        System.out.println("Number of scores below the average: " + (count - aboveOrEqualCount));

        input.close();
    }
}