
public class WeatherStation {
    private String stationID;
    private double[] totalRainfall = new double[13]; // index 1-12
    private int[] dailyCounts = new int[13];         // index 1-12

    public WeatherStation(String identifier) {
        this.stationID = identifier;
    }

    public String getId() {
        return stationID;
    }

    public void recordDailyRain(int month, double rainfall) {
        if (month >= 1 && month <= 12) {
            totalRainfall[month] += rainfall;
            dailyCounts[month]++;
        }
    }

    public int getCountForMonth(int month) {
        if (month >= 1 && month <= 12) {
            return dailyCounts[month];
        }
        return 0;
    }

    public double getAvgForMonth(int month) {
        if (month >= 1 && month <= 12 && dailyCounts[month] > 0) {
            return totalRainfall[month] / dailyCounts[month];
        }
        return -1;
    }

    public int getLowestMonth() {
        double minAvg = Double.MAX_VALUE;
        int minMonth = 1;

        for (int month = 1; month <= 12; month++) {
            double avg = getAvgForMonth(month);
            if (avg != -1 && avg < minAvg) {
                minAvg = avg;
                minMonth = month;
            }
        }

        return minMonth;
    }
}
