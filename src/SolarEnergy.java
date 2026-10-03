import java.util.Scanner;

public class SolarEnergy {
    public static double total(double morning, double evening) {
        return morning + evening;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter morning energy: ");
        double m = sc.nextDouble();

        System.out.print("Enter evening energy: ");
        double e = sc.nextDouble();

        System.out.println("Total energy: " + total(m, e) + " kWh");

        sc.close();
    }
}