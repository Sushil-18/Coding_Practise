import java.util.Stack;

public class BaseballGame {

    public static void main(String[] args) {
        String[] operations = {"5", "2", "C", "D", "+"}; // Example input
        int totalScore = calPoints(operations);
        System.out.println("Total Score: " + totalScore);
    }

    public static int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();

        for (String op : operations) {
            switch (op) {
                case "C":
                    if (!scores.isEmpty()) {
                        scores.pop(); // Invalidate the last score
                    }
                    break;
                case "D":
                    if (!scores.isEmpty()) {
                        scores.push(scores.peek() * 2); // Double the last score
                    }
                    break;
                case "+":
                    if (scores.size() >= 2) {
                        int sum = scores.get(scores.size() - 1) + scores.get(scores.size() - 2);
                        scores.push(sum); // Add the sum of the last two scores
                    }
                    break;
                default: // It must be an integer
                    scores.push(Integer.parseInt(op)); // Record a new score
                    break;
            }
        }

        // Calculate the total score
        int total = 0;
        while (!scores.isEmpty()) {
            total += scores.pop();
        }

        return total;
    }
}
