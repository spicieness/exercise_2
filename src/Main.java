// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int i = 0;
        String[] days = {"Sunday", "Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday"};
        double highTemp[] = {45, 29, 10, 22, 41, 28, 33};
        double chanceRain[] = {95, 60, 25, 5, 0, 75, 90};



        for(i=0; i<highTemp.length; i++) {
            if (highTemp[i] <= 32 && chanceRain[i] > 50) {
                System.out.println("It is likely to snow on day "+days[i]);
            }

        }

    }
}