package chapterTwo;
//2.16
//  (Comparing Integers) Write an application that asks the user to enter one integer, obtains it from the user
//  and displays whether the number and its square are greater than, equal to, not equal
//  to, or less than the number 100. Use the techniques shown in Fig. 2.15.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleComparisonOfIntegerTest {
        SimpleComparisonOfInteger integer;
        @BeforeEach
    void setUp(){
            integer = new SimpleComparisonOfInteger(10);
    }

    @Test
    void integerWasInputted(){
            assertEquals(10, integer.getInteger());
    }

    @Test
    void numberHasASquare(){
        assertEquals(100, integer.getIntegerSquare());
    }
    @Test
    void firstComparisonTest(){
            assertEquals("The Integer is lesser than 100", integer.getComparison());
    }
}
