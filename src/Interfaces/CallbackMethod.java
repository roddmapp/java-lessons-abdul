package Interfaces;

interface Member {
    public void callback();
}

class Store {
    Member[] members  = new Member[10];
    int count = 0;

    Store() {}

    void register(Member m) {
        members[count++] = m;
    }

    void inviteSale()  {
        for (int i = 0;  i < count; i++)  {
            members[i].callback();
        }
    }
}

class Customer implements Member {

    String name;

    Customer(String n) {
        name = n;
    }
    @Override
    public void callback() {
        System.out.println("Ok I will visit, " + name);
    }
}

public class CallbackMethod {
    public static void main(String[] args) {
        Store store = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");

        store.register(c1);
        store.register(c2);

        store.inviteSale();
    }
}
