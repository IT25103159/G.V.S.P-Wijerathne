public class Calculator {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to square a single integer
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        // Expression 1: (3 * 4 + 5 * 7) ^ 2
        // Step 1: Handle multiplication inside brackets
        int part1 = myCalc.multiply(3, 4); // 12
        int part2 = myCalc.multiply(5, 7); // 35

        // Step 2: Add results together
        int sumInside = myCalc.add(part1, part2); // 47

        // Step 3: Square the final sum
        int result1 = myCalc.square(sumInside); // 2209
        System.out.println("Result of (3 * 4 + 5 * 7)^2: " + result1);

        // Expression 2: (4 + 7) ^ 2 + (8 + 3) ^ 2
        // Step 1: Solve additions inside brackets
        int bracketA = myCalc.add(4, 7);
        int bracketB = myCalc.add(8, 3);

        // Step 2: Square both results
        int squareA = myCalc.square(bracketA);
        int squareB = myCalc.square(bracketB);

        // Step 3: Add the squares together
        int result2 = myCalc.add(squareA, squareB);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2: " + result2);
    }
}


