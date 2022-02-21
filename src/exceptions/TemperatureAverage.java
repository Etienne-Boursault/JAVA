package exceptions;

import java.util.ArrayList;
import java.util.List;

public class TemperatureAverage {

    /** Affiche la temp�rature moyenne � partir des valeurs fournies comme arguments en ligne de commande
     *
     * @param args liste de temp�ratures s�par�es par des espaces
     */
    public static void main(String[] args) {

        try {
            List<Integer> recordedTemperaturesInDegreesCelcius = new ArrayList<Integer>();

            // Remplissez la liste � partir des valeurs fournies comme arguments en ligne de commande
            for (String stringRepresentationOfTemperature : args) {
                int temperature = Integer.parseInt(stringRepresentationOfTemperature);
                recordedTemperaturesInDegreesCelcius.add(temperature);
            }

            // calculez et affichez la temp�rature moyenne
            int averageTemperature = SimpleMaths.calculateAverage(recordedTemperaturesInDegreesCelcius);
            System.out.println("The average temperature is " + averageTemperature);
        } catch (NumberFormatException e) {
            System.out.println("All arguments should be provided as numbers");
            System.exit(-1);
        } catch (ArithmeticException e) {
            System.out.println("At least one temperature should be provided");
            System.exit(-1);
        }
    }
}
