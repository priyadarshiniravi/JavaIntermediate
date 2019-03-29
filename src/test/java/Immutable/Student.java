package Immutable;

class Student {
    final String name;
    final Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return Address.instanceOf(address);
    }
}
