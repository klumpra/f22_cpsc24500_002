package tempconvert;
import java.util.Scanner;
public class App {
    public static double convertToCelsius(double temp) {
        return 5.0/9*(temp - 32);
    }
    public static double convertToFahr(double temp) {
        return 9.0/5*temp + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in degrees followed by F or C: ");
        double temp;
        String scale;
        temp = sc.nextDouble();
        scale = sc.next();
        double newTemp;
        if (scale.equalsIgnoreCase("F")) {
            newTemp = convertToCelsius(temp);
            System.out.printf("That is %.2f degrees C.\n", newTemp);
        } else if (scale.equalsIgnoreCase("C")) {
            newTemp = convertToFahr(temp);
            System.out.printf("That is %.2f degrees F.\n", newTemp);
        } else {
            System.out.println("Dude.");
        }
    }
}
