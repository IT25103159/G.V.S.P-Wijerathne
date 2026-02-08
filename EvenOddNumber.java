public class EvenOddNumber {
    // Method to find if number is even or odd
    public boolean findEvenOrOdd(int i) {
        // Returns true if even, false if odd
        return (i % 2 == 0);
    }
}

//Demo.java
public class Demo {
    public static void main(String[] args) {
        // Create object from EvenOddNumber class
        EvenOddNumber checker = new EvenOddNumber();
        // Test with various numbers
        int[] testNumbers = {5, 10, 15, 20, 33, 42};
        for (int num : testNumbers) {
            boolean isEven = checker.findEvenOrOdd(num);
            if (isEven) {
                System.out.println(num + " is an even number");
            } else {
                System.out.println(num + " is an odd number");
            }
        }
    }
}



