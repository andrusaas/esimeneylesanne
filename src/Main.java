import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

	System.out.println("Enter temp:");
        double temp = in.nextDouble();

	System.out.println("Enter units:(C or F)");
        String unit = in.next();

	unit = unit.toUpperCase();

	if (!(unit.equals("C") || unit.equals("F"))) {
            System.out.println("Wrong unit!");
            return;
        }

	Converter converter = new Converter();

	DecimalFormat decimalFormat = new DecimalFormat("0.00");

	if (unit.equals("C")) {
            converter.setCelsius(temp);
            double f = converter.getFahrenheit();
            System.out.println("In Fahrenheit:" + decimalFormat.format(f));
        }

	if (unit.equals("F")) {
            converter.setFahrenheit(temp);
            double c = converter.getCelsius();
            System.out.println("In Celsius:" + decimalFormat.format(c));
        }
    }
}
