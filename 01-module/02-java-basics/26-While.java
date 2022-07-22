public class App {
    public static void printNumbers(int firstNumber) {
        // BEGIN (write your solution here)
        var i = firstNumber;
        while (i > 0) {
            System.out.println(i);
            i -= 1;
        }
        System.out.println("finished!");
        // END
    }
}
