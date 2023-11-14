public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Making code say "FizzBuzz" for increments of 15
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                // Making code say "Fizz" for increments of 3
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                // Making code say "Buzz" for increments of 5
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
