public class Converter {
    protected double celsius = 0, fahrenheit = 0;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = (celsius * 1.8) + 32;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        this.celsius = (0.556) * (fahrenheit - 32);
    }
}
