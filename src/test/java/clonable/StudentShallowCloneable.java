package clonable;

final class StudentShallowCloneable implements Cloneable{
    final String name;
    final Address address;

    public StudentShallowCloneable(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return Address.instanceOf(address);
    }

    public StudentShallowCloneable clone() throws CloneNotSupportedException {
        return (StudentShallowCloneable) super.clone();
    }
}
