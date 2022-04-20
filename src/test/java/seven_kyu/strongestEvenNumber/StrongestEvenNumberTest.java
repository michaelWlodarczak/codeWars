package seven_kyu.strongestEvenNumber;


import org.junit.Test;
import seven_kyu.strongestEvenNumber.listSolution.StrongestEvenNumberList;

import static org.junit.Assert.assertEquals;

public class StrongestEvenNumberTest{
    @Test
    public void sampleTests() {
        assertEquals(2, StrongestEvenNumberList.strongestEven(1,2));
        assertEquals(8, StrongestEvenNumberList.strongestEven(5,10));
        assertEquals(48, StrongestEvenNumberList.strongestEven(48,56));
        assertEquals(192, StrongestEvenNumberList.strongestEven(129,193));
    }
}