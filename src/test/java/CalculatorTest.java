import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator myCalc;

    @BeforeEach
    void setup(){
        myCalc = new Calculator();
    }

   @Test
    void testAddSuccess(){
        assertEquals(8,myCalc.add(4,4));
    }
    @Test
    void testAddFail(){
       Exception ex =  assertThrows(IllegalArgumentException.class,()-> {myCalc.add(Integer.MAX_VALUE,4);});
       assertEquals("Your values are to big", ex.getMessage());
    }
    @Test
    void testSubtractSuccess(){assertEquals(5, myCalc.subtract(10,5));}

    @Test
    void testSubtractFail(){
       Exception ex = assertThrows( IllegalStateException.class, ()->{myCalc.subtract(10, 20);} );
       assertEquals("negative results not allowed", ex.getMessage());
    }
    @Test
    void testDivideSuccess(){assertEquals(2, myCalc.divide(10,5));}

    @Test
    void testDivideFail(){
        Exception ex = assertThrows(ArithmeticException.class, ()->{myCalc.divide(10,0);});
        assertEquals("can't / by zero", ex.getMessage());
    }

}
