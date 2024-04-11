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

    @Test
    void testdivide(){
        newCalc=new Calc();
        assertEquals(5,newCalc.divide(10,2));
    }

    @Test
    void testmultiply(){
        newCalc=new Calc();
        assertEquals(20,newCalc.multiply(10,2));
    }

}
