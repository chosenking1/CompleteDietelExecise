package chapterTwo;
//  2.17
//  (Arithmetic, Smallest and Largest)
//  Write an application that inputs three integers from the user and
//  displays the sum, average, product, smallest and largest of the numbers.
//  Use the techniques shown in Fig. 2.15.
//  [Note: The calculation of the average in this exercise should result in an integer
//  representation of the average. So, if the sum of the values is 7, the average should be 2, not
//  2.3333….]

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArithmeticSmallestAndLargestTest {
    ArithmeticSmallestAndLargest arithmeticSmallestAndLargest;

    @BeforeEach
    void setUp(){
        arithmeticSmallestAndLargest = new ArithmeticSmallestAndLargest(20,10,30);
    }

    @Test

    void theSmallestNumberCanBeGotten(){
        assertEquals(10, arithmeticSmallestAndLargest.smallestNumber());
    }

    @Test

    void theLargestNumberCanBeGotten(){
        assertEquals(30, arithmeticSmallestAndLargest.largestNumber());
    }

    @Test

    void theSumCanBeGotten(){
        assertEquals(60, arithmeticSmallestAndLargest.sumOfNumbers());
    }

    @Test

    void theProductCanBeGotten(){
        assertEquals(6000, arithmeticSmallestAndLargest.productOfNumbers());
    }

    @Test

    void theAverageCanBeGotten(){
        assertEquals(20, arithmeticSmallestAndLargest.averageOfNumbers());
    }
}
