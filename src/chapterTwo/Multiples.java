package chapterTwo;

public class Multiples {


    public boolean checker(int firstNumber, int secondNumber) {
        if((firstNumber * firstNumber * firstNumber) / (secondNumber * secondNumber) == 0){
            return true;
        }
        return false;
    }
}
