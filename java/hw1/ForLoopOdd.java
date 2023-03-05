package hw1;

public class ForLoopOdd {
    public static void main(String[] args) {
        // this is to print 10 odd number using for loop

        for (int e = 2; e <= 20; e++) {
            if (e % 2 == 1)
                System.out.println("Odd No:" +e);
        }
    }
}