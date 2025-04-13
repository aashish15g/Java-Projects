import java.util.Scanner;

public class WeatherTest {
    public static void main(String[] args) {
        // Simulate file input with multiple lines of data
        String data = """
            STN001 2023-04-05 12.5
            STN002 2023-04-05 0.0
            STN001 2023-04-06 5.1
            STN002 2023-05-01 10.0
            STN001 2023-05-03 3.0
            STN002 2023-05-04 0.5
            STN003 2023-04-01 0.0
            """;

        Scanner input = new Scanner(data);

        // Create the bureau and load the data
        WeatherBureau bureau = new WeatherBureau();
        bureau.recordDailySummaries(input);

        // Example: Get station by ID
        WeatherStation stn1 = bureau.getStation("STN001");
        System.out.println("STN001 - Avg April Rainfall: " + stn1.getAvgForMonth(4));
        System.out.println("STN001 - Avg May Rainfall: " + stn1.getAvgForMonth(5));
        System.out.println("STN001 - Lowest Month: " + stn1.getLowestMonth());

        // Get lowest rainfall station in April
        WeatherStation lowestApril = bureau.lowestStation(4);
        System.out.println("Lowest station in April: " + (lowestApril != null ? lowestApril.getId() : "None"));

        // Get station with lowest average in any month
        WeatherStation lowestOverall = bureau.lowestStation();
        System.out.println("Lowest station overall: " + (lowestOverall != null ? lowestOverall.getId() : "None"));
    }
}
