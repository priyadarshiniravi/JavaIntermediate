package Immutable;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ImmutableClassTest {
    @Test
    public void isNotImmutableThoughAllAreFinalDueToGettersAndSetters() {
        String line1 = "line1";
        Student student = new Student("Priya", new Address(line1, "line2"));

        student.getAddress().setLine1("lineModified");

        assertNotEquals(line1,student.getAddress().getLine1());
    }

    @Test
    public void immutableStudentWithCopyConstructorBeImmutable() {
        String line1 = "line1";
        ImmutableStudentWithCopyConstructor student =
                new ImmutableStudentWithCopyConstructor("Priya", new Address(line1, "line2"));

        student.getAddress().setLine1("lineModified");

        assertEquals(line1,student.getAddress().getLine1());
    }
}
