public class DependencyTest {
    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService ser = new CustomerService(repo);
        int id = 1;
        ser.findCustomer(id);
    }
}
