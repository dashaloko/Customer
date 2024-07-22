package app;

public class Customer {

    // Виправте декларацію змінних класу
    private final String name;
    private final String phone;

    // Виправте визначення конструктора
    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Пропишіть нижче getters для всіх змінних класу

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


