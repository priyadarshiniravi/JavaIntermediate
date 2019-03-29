package clonable;

public class Address implements Cloneable{
    String line1;
    String line2;

    public Address(String line1, String line2) {
        this.line1 = line1;
        this.line2 = line2;
    }

    public static Address instanceOf(Address address) {
        return new Address(address.line1, address.line2);
    }

    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}
