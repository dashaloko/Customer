package app;

public class Customer {


    private final String name;
    private final String phone;

    // constructor
    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }



    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name " + name + ", Phone " + phone;
    }
}


