package chapterTwo;

//  2.26
//  (Multiples) Write an application that reads two integers,
//  determines whether the first number tripled is a multiple of the second number doubled,
//  and prints the result.
//  [Hint: Use the remainder operator.]
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MultiplesTest {
    @Test
            void itIsAMultipleTest(){
        Multiples multiple = new Multiples();
        boolean factor = multiple.checker(3, 9);
        assertTrue(factor);
    }

    @Test
    void itIsNotAMultiple(){
        Multiples multiple = new Multiples();
        boolean factor = multiple.checker(3, 5);
        assertFalse(factor);
    }

}
