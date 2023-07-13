public class NamedLoop {
    public static void main(String[] args) {
        outerLoop: // Label for the outer loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Iteration " + i);

            innerLoop: // Label for the inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("  Sub-iteration " + j);

                if (i == 2 && j == 2) {
                    break outerLoop; // Breaks out of the outer loop completely
                }

                if (i == 1 && j == 2) {
                    continue innerLoop; // Skips to the next iteration of the inner loop
                }

                // Code inside the inner loop
                System.out.println("    Performing some task");
            }
        }

        System.out.println("Loop execution complete");
    }
}