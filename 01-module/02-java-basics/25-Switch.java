public class App {
    // BEGIN (write your solution here)
    public static String getNumberExplanation(int number) {
        switch (number) {
            case 7:
                return "prime number";
            case 42:
                return "answer for everything";
            case 666:
                return "devil number";
            default:
                return null;
        }
    }
    // END
}
