public class FinancialForecasting {
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        } else {
            double nextYearValue = initialValue * (1 + growthRate);
            return calculateFutureValue(nextYearValue, growthRate, years - 1);
        }
    }
}