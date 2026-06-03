public class ObserverTest {
    public static void main(String[] args) {
        StockMarket stock = new StockMarket();
        User user1 = new MobileApp("Manu");
        User user2 = new WebApp("Manuha");
        stock.register(user1);
        stock.register(user2);
        stock.notifying();
    }
}
