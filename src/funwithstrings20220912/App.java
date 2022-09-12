package funwithstrings20220912;

public class App {
    public static void main(String[] args) {
        String greeting = "The Bears won. Hallejua!";
        String shouted = greeting.toUpperCase();
        String meek = greeting.toLowerCase();
        String part = greeting.substring(4,9);
        System.out.printf("Lower: %s, Upper: %s, Part: %s\n",
                                meek, shouted, part);
    }
}
