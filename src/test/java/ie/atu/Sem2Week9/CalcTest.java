package ie.atu.Sem2Week9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calc newCalc;

    @Test
    void testadd(){
        newCalc=new Calc();
        assertEquals(10,newCalc.add(4,6));
    }

    @Test
    void testsubtract(){
        newCalc=new Calc();
        assertEquals(6,newCalc.subtract(10,4));
    }

}
