package testscoresdropmin;
import java.util.Scanner;
public class App {
    public static double findMinimum(double n1, double n2, double n3, double n4) {
        double result = n1;
        if (n2 < result) {
            result = n2;
        } 
        if (n3 < result) {
            result = n3;
        }
        if (n4 < result) {
            result = n4;
        }
        return result;
    }
    public static String findLetterGrade(double avg) {
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the four test scores: ");
        double s1, s2, s3, s4; // the four test scores
        s1 = sc.nextDouble();
        s2 = sc.nextDouble();
        s3 = sc.nextDouble();
        s4 = sc.nextDouble();
        double theMin = findMinimum(s1,s2,s3,s4);
        double avg = (s1 + s2 + s3 + s4 - theMin) / 3;
        String letter = findLetterGrade(avg);
        System.out.printf("You earned an average of %.2f, which is a grade of %s.\n",
           avg, letter);
    }
}
