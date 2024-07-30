public class ObserverTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice("AAPL", 150.0);
        stockMarket.setStockPrice("GOOG", 2500.0);

        stockMarket.deregisterObserver(mobileApp);

        stockMarket.setStockPrice("AAPL", 160.0);
    }
}