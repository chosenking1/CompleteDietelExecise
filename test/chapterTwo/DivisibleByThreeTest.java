package chapterTwo;

//2.25
//        (Divisible by 3) Write an application that reads an integer and
//        determines and prints whether it’s divisible by 3 or not.
//        [Hint: Use the remainder operator. A number is divisible by 3 if it’s divided by 3 with a remainder of 0.]
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivisibleByThreeTest {
    @Test
    void firstTest(){
        DivisibleByThree divisibleByThree = new DivisibleByThree();
        Boolean result = divisibleByThree.divisibility(98);
        assertFalse(result);
    }

    @Test
    void secondTest(){
        DivisibleByThree divisibleByThree = new DivisibleByThree();
        Boolean result2 = divisibleByThree.divisibility(9);
        assertTrue(result2);
    }


}
