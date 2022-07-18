public class App {
    // BEGIN (write your solution here)
    public static String truncate(String text, int length) {
        return text.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        System.out.println(truncate("Hexlet", 2));
    }
    // END
}
