package funwithrandom20220912;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random randy = new Random();
        int randomNumber = randy.nextInt(10);
        System.out.println(randomNumber);
    }    
}
