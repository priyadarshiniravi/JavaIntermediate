package String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class StringTest {

    @Test
    public void shouldHaveStringOnPlusOperator() {
        String name = "Priya";
        int initialAddress = System.identityHashCode(name);
        name = name + " " + "Ravi";

        assertNotEquals(initialAddress, System.identityHashCode(name));
    }

    @Test
    public void shouldCreateTwoAddressAsNotAddedToStringPool() {
        String priya = new String("Priya");
        String priya1 = new String("Priya");

        assertNotEquals(System.identityHashCode(priya), System.identityHashCode(priya1));
        assertFalse(priya == priya1);
        assertTrue(priya.equals(priya1));

    }

    @Test
    public void shouldCreateNotTwoAddressAlsoKnowAsStringInterning() {
        String priya = "Priya";
        String priya1 = "Priya";

        assertEquals(System.identityHashCode(priya), System.identityHashCode(priya1));
        assertTrue(priya == priya1);
        assertTrue(priya.equals(priya1));
    }

    @Test
    public void shouldPointToDiffrentAddressIfNewAndQuotedString() {
        String priya = "Priya";
        String priya1 = new String("Priya");

        assertNotEquals(System.identityHashCode(priya), System.identityHashCode(priya1));
        assertFalse(priya == priya1);
        assertTrue(priya.equals(priya1));
    }

    @Test
    public void shouldAddNewStringToPoolUsingIntern() {
        String priya1 = new String("Priya").intern();
        String priya = "Priya";

        assertEquals(System.identityHashCode(priya), System.identityHashCode(priya1));
        assertTrue(priya == priya1);
        assertTrue(priya.equals(priya1));
    }

    @Test
    public void shouldReturnNewStringFromPoolUsingIntern() {
        String priya = "Priya";
        String priya1 = new String("Priya").intern();

        assertEquals(System.identityHashCode(priya), System.identityHashCode(priya1));
        assertTrue(priya == priya1);
        assertTrue(priya.equals(priya1));
    }

}
