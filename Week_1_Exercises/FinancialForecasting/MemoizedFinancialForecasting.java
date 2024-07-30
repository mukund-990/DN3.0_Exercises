import java.util.HashMap;
import java.util.Map;

public class MemoizedFinancialForecasting {
    private static Map<Integer, Double> memo = new HashMap<>();

    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        if (memo.containsKey(years)) {
            return memo.get(years);
        }

        if (years == 0) {
            return initialValue;
        } else {
            double nextYearValue = initialValue * (1 + growthRate);
            double futureValue = calculateFutureValue(nextYearValue, growthRate, years - 1);

            memo.put(years, futureValue);
            return futureValue;
        }
    }
}