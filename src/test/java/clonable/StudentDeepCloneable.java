package clonable;

final class StudentDeepCloneable implements Cloneable {
    String name;
    Address address;

    public StudentDeepCloneable(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return Address.instanceOf(address);
    }

    public StudentDeepCloneable clone() throws CloneNotSupportedException {
        StudentDeepCloneable clone = (StudentDeepCloneable) super.clone();
        clone.address = this.address.clone();
        return clone;
    }
}
