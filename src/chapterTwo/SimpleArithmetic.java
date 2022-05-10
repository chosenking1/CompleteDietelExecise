package chapterTwo;

public class SimpleArithmetic {
    private int firstNumber;
    private int secondNumber;

    public SimpleArithmetic(int number1, int number2) {
        firstNumber = number1;
        secondNumber = number2;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getFirstSquare() {

        return firstNumber * firstNumber;
    }

    public int getSecondSquare() {
        return secondNumber * secondNumber;
    }

    public int getSumOfSquare(){
        return getFirstSquare() + getSecondSquare();
    }

    public int getSquareSubtraction() {
        return getFirstSquare() - getSecondSquare();
    }
}
