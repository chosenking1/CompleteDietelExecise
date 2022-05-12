package chapterTwo;

//2.24
//        Write an application that reads five integers and
//        determines and prints the largest and smallest integers in the group.
//        Use only the programming techniques you learned in this chapter.
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LargestAndSmallestIntegersTest {
    LargestAndSmallestIntegers largestAndSmallestIntegers;

    @BeforeEach
    void setUp(){
        largestAndSmallestIntegers = new LargestAndSmallestIntegers(30, 50, 40, 20, 10);
    }

    @Test
    void largestNumberCanBePrinted(){
    assertEquals(50, largestAndSmallestIntegers.largestInteger());
    }

    @Test
    void smallestNumberCanBePrinted(){
        assertEquals(10, largestAndSmallestIntegers.smallestInteger());
    }
}
