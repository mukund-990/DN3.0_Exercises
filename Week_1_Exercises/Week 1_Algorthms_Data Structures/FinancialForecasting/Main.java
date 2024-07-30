public class Main {
    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05;
        int years = 5;

        double futureValue = FinancialForecasting.calculateFutureValue(initialValue, growthRate, years);
        System.out.println("Future value after " + years + " years (without memoization): " + futureValue);

        double memoizedFutureValue = MemoizedFinancialForecasting.calculateFutureValue(initialValue, growthRate, years);
        System.out.println("Future value after " + years + " years (with memoization): " + memoizedFutureValue);
    }
}