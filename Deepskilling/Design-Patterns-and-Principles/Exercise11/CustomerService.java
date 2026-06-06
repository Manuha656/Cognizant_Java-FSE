public class CustomerService {
    CustomerRepository repo;

    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public void findCustomer(int id) {
        repo.findCustomerById(id);
    }
}
