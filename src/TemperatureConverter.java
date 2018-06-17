import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        System.out.println("Input temperature in Farenheit: ");
        a = scanner.nextDouble();

        double C = ((a-32)*5)/9;
        System.out.println("Temperature in Celcius: " + C);

    }
}
