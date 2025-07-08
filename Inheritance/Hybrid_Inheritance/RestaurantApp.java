
interface Worker {
    void performDuties();
}


class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showBasicInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}


class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        showBasicInfo();
        System.out.println("Role: Chef | Specializes in: " + specialty);
        System.out.println("Duties: Preparing dishes and managing kitchen.");
    }
}
class Waiter extends Person implements Worker {
    int tableCount;

    Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        showBasicInfo();
        System.out.println("Role: Waiter | Handles tables: " + tableCount);
        System.out.println("Duties: Serving food and attending customers.");
    }
}

public class RestaurantApp {
    public static void main(String[] args) {
        Worker c = new Chef("Arjun", 201, "Italian Cuisine");
        Worker w = new Waiter("Priya", 202, 5);

        c.performDuties();
        System.out.println("---");
        w.performDuties();
    }
}