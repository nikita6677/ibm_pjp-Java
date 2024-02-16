public class Student1 {
    int id;
    String name;
    Address address;

    public Student1(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("ID1", "Maharashtra", "India");
        Address address2 = new Address("ID2", "Delhi", "India");

        Student e = new Student(111, "Subhash", address1);
        Student e2 = new Student(112, "Anil", address2);

        e.display();
        e2.display();
    }
}

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
