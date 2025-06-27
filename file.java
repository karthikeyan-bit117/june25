public class SpiralPatternExample2 {
    // Function to print the spiral pattern
    public static void printPattern(int n) {
        // Determine the boundary size of the array
        int size = 2 * n - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Calculate and print the values for pattern
                System.out.print((Math.max(Math.abs(i - n), Math.abs(j - n)) + 1) + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println();
        printPattern(n);
    }
}

