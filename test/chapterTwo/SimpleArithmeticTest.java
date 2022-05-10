package chapterTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2.15
// Write an application that asks the user to enter two integers, obtains them from
// the user and prints the square of each, the sum of their squares, and the difference of the squares
// (first number squared minus the second number squared). Use the techniques shown in Fig. 2.7.
public class SimpleArithmeticTest {
        private SimpleArithmetic arithmetic;
        @BeforeEach
        public void setUp(){
                arithmetic = new SimpleArithmetic(10,12);
        }

       @Test

       public void inputsCanBeCollected(){
                assertEquals(10, arithmetic.getFirstNumber());
                assertEquals(12, arithmetic.getSecondNumber());
       }

       @Test
    public void squareCanBeCalculated(){
            assertEquals(100, arithmetic.getFirstSquare());
            assertEquals(144, arithmetic.getSecondSquare());
       }

       @Test
    void squareCanBeAdded(){
//           int addition = arithmetic.getFirstSquare() + arithmetic.getSecondSquare();
           assertEquals(244, arithmetic.getSumOfSquare());
       }

       @Test
    void squareCanBeSubtracted(){
            assertEquals(-44, arithmetic.getSquareSubtraction());
       }

}
