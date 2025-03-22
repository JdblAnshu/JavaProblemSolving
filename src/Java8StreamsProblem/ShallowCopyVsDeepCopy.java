public class ShallowCopyVsDeepCopy {
}
/*
class Person implements Cloneable {
    String name;
    int age;
    Address address;

    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Implementing clone() method for shallow copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // This performs a shallow copy
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}

class Address {
    String street;

    Address(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return street;
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("123 Main St");
        Person person1 = new Person("Alice", 30, address);

        // Shallow copy
        Person person2 = (Person) person1.clone();

        // Modify the address of person2
        person2.address.street = "456 Oak St";

        // Both person1 and person2 share the same Address object
        System.out.println(person1); // Name: Alice, Age: 30, Address: 456 Oak St
        System.out.println(person2); // Name: Alice, Age: 30, Address: 456 Oak St
    }
}

 */


/*
class Person implements Cloneable {
    String name;
    int age;
    Address address;

    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Implementing deep copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = new Address(this.address.street); // Deep copy of address
        return cloned;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}

class Address {
    String street;

    Address(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return street;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("123 Main St");
        Person person1 = new Person("Alice", 30, address);

        // Deep copy
        Person person2 = (Person) person1.clone();

        // Modify the address of person2
        person2.address.street = "456 Oak St";

        // person1 remains unchanged
        System.out.println(person1); // Name: Alice, Age: 30, Address: 123 Main St
        System.out.println(person2); // Name: Alice, Age: 30, Address: 456 Oak St
    }
}

 */