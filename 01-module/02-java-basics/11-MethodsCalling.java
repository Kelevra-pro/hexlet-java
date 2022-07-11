public class App {
    public static void main(String[] args) {
        var text = "  Never forget what you are, for surely the world will not\n ";

        // BEGIN (write your solution here)
        var trimmedText = text.trim();
        var result = "First: "
                + trimmedText.charAt(0)
                + "\nLast: "
                + trimmedText.charAt(trimmedText.length() - 1);

        System.out.println(result);
        // END
    }
}
