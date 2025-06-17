package Methods.Level2PraticePrograms;

public class UnitConvertor2 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        System.out.println("212 Fahrenheit = " + convertFahrenheitToCelsius(212) + " Celsius");
        System.out.println("100 Celsius = " + convertCelsiusToFahrenheit(100) + " Fahrenheit");
        System.out.println("150 pounds = " + convertPoundsToKilograms(150) + " kilograms");
        System.out.println("68 kilograms = " + convertKilogramsToPounds(68) + " pounds");
        System.out.println("5 gallons = " + convertGallonsToLiters(5) + " liters");
        System.out.println("10 liters = " + convertLitersToGallons(10) + " gallons");
    }
}
