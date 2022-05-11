package chapterTwo;

public class ArithmeticSmallestAndLargest {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;
    public ArithmeticSmallestAndLargest(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public int smallestNumber() {
        if (firstNumber < secondNumber){
            if(firstNumber < thirdNumber){
                return firstNumber;
            }
        }
        if (secondNumber < firstNumber){
            if(secondNumber < thirdNumber){
                return secondNumber;
            }
        }
        if (thirdNumber < secondNumber){
            if(thirdNumber < firstNumber){
                return thirdNumber;
            }
        }
        return 0;
    }

    public int largestNumber() {
        if (firstNumber > secondNumber){
            if(firstNumber > thirdNumber){
                return firstNumber;
            }
        }
        if (secondNumber > firstNumber){
            if(secondNumber > thirdNumber){
                return secondNumber;
            }
        }
        if (thirdNumber > secondNumber){
            if(thirdNumber > firstNumber){
                return thirdNumber;
            }
        }
        return 0;
    }
}
