package immutable;

public class ImmutableStudentWithCopyConstructor {
    final String name;
    final Address address;

    public ImmutableStudentWithCopyConstructor(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return Address.instanceOf(address);
    }
}
