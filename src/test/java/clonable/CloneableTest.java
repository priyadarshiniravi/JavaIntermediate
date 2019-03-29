package clonable;

import org.junit.Test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

public class CloneableTest {
    @Test
    public void shouldShallowCloneStudent() throws CloneNotSupportedException {
        StudentShallowCloneable studentShallowCloneable =
                new StudentShallowCloneable("priya", new Address("line1", "line2"));

        StudentShallowCloneable studentClone = studentShallowCloneable.clone();

        assertSame(studentClone.address, studentShallowCloneable.address);
    }

    @Test
    public void shouldDeepClone() throws CloneNotSupportedException {
        StudentDeepCloneable studentShallowClonable =
                new StudentDeepCloneable("priya", new Address("line1", "line2"));

        StudentDeepCloneable studentClone = studentShallowClonable.clone();

        assertNotSame(studentClone.address, studentShallowClonable.address);
    }

    @Test(expected = CloneNotSupportedException.class)
    public void shouldThrowCloneableNotImplemented() throws CloneNotSupportedException {
        CloneNotImplemented cloneNotImplemented = new CloneNotImplemented();

        cloneNotImplemented.clone();
    }

}
