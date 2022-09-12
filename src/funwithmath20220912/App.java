package funwithmath20220912;

public class App {
    public static void main(String[] args) {
        int x = 4;
        int y = 3;
        double z = (double)x / y;
        double roundUp = Math.ceil(z);
        double roundDown = Math.floor(z);
        System.out.println(z);
        System.out.println(roundUp);
        System.out.println(roundDown);
        System.out.println("Exact = " + z + " Up = " +
           roundUp + " Down = " + roundDown);
        System.out.printf("Exact = %10.2f, Up = %10.2f, Down = %10.2f\n",
            z, roundUp, roundDown);
    }
}
