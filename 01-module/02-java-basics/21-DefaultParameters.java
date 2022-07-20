class App {
    public static String getHiddenCard(String cardNumber, int starsCount) {
        var stars = "*".repeat(starsCount);
        var visibleDigits = cardNumber.substring(12);

        return stars + visibleDigits;
    }

    public static String getHiddenCard(String cardNumber) {
        return App.getHiddenCard(cardNumber, 4);
    }

    public static void main(String[] args) {
        System.out.println(App.getHiddenCard("2034399002121100", 1));
    }
}