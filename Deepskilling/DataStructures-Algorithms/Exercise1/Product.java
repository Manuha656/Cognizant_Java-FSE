public class Product {
    int productId, quantity, price;
    String productName;

    public Product(int productId, String productName, int quantity, int price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
}