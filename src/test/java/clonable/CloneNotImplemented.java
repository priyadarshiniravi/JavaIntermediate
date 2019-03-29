package clonable;

public class CloneNotImplemented {
    public CloneNotImplemented clone() throws CloneNotSupportedException {
        return (CloneNotImplemented) super.clone();
    }
}
