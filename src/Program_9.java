
// 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

public class Program_9 {

    public static void main(String[] args) {

        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

}
