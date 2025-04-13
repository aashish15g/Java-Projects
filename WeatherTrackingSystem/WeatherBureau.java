import java.util.*;

//-------------------------------------------------------------------------
/**
 *  WeatherBureau class that holds the data of all weather stations.
 */
public class WeatherBureau {
    private Map<String, WeatherStation> stations;

    public WeatherBureau() {
        stations = new HashMap<>();
    }

    public void recordDailySummary(String text) {

        String[] parts = text.split(" ");
        if (parts.length != 3) return;

        String id = parts[0];
        String date = parts[1]; // e.g., "2023-06-14"
        double rainfall = Double.parseDouble(parts[2]);


        int month = Integer.parseInt(date.split("-")[1]);


        WeatherStation station = stations.get(id);
        if (station == null) {
            station = new WeatherStation(id);
            stations.put(id, station);
        }

        station.recordDailyRain(month, rainfall);
    }

    public void recordDailySummaries(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            recordDailySummary(line);
        }
    }

    public WeatherStation getStation(String identifier) {
        return stations.get(identifier);
    }

    public WeatherStation lowestStation(int month) {
        double minAvg = Double.MAX_VALUE;
        WeatherStation result = null;

        for (WeatherStation station : stations.values()) {
            double avg = station.getAvgForMonth(month);
            if (avg != -1 && avg < minAvg) {
                minAvg = avg;
                result = station;
            }
        }

        return result;
    }

    public WeatherStation lowestStation() {
        double minAvg = Double.MAX_VALUE;
        WeatherStation result = null;

        for (WeatherStation station : stations.values()) {
            int lowestMonth = station.getLowestMonth();
            double avg = station.getAvgForMonth(lowestMonth);

            if (avg != -1 && avg < minAvg) {
                minAvg = avg;
                result = station;
            }
        }

        return result;
    }
}
