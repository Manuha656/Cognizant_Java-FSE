import java.util.ArrayList;

public class StockMarket implements Stock {
    public ArrayList<User> list = new ArrayList<>();

    public void register(User o) {
        list.add(o);
    }

    public void deregister(User o) {
        list.remove(o);
    }

    public void notifying() {
        for (User o : list)
            o.update();
    }
}
