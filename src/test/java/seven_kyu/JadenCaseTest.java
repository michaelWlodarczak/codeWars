package seven_kyu;

import seven_kyu.JadenCase;
import junit.framework.TestCase;
import org.junit.Test;

public class JadenCaseTest extends TestCase {
    JadenCase jadenCase = new JadenCase();

    @Test
    public void test() {
        assertEquals("toJadenCase doesn't return a valide seven_kyu.JadenCase String! try again please :)", "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
    }

    @Test
    public void testNullArg() {
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is empty string", jadenCase.toJadenCase(""));
    }

}


