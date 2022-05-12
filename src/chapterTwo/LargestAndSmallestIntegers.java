package chapterTwo;

public class LargestAndSmallestIntegers {
   private final int firstNumber;
   private final int secondNumber;
   private final int thirdNumber;
    private final int fourthNumber;
    private final int fifthNumber;
    public LargestAndSmallestIntegers(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        this.fourthNumber = fourthNumber;
        this.fifthNumber = fifthNumber;
    }

    public int largestInteger() {
        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                if (firstNumber > fourthNumber) {
                    {
                        if (firstNumber > fifthNumber)
                            System.out.println("The Largest number is: " + firstNumber);
                        return firstNumber;
                    }
                }
            }
        }

        if (secondNumber > firstNumber) {
            if (secondNumber > thirdNumber) {
                if (secondNumber > fourthNumber) {
                    if (secondNumber > fifthNumber){
                        System.out.println("The Largest number is: " + secondNumber);
                    System.out.println("The Largest number is: " + fifthNumber);

                    return secondNumber;
                    }
                }
            }
        }

        if (thirdNumber > firstNumber) {
            if (thirdNumber > secondNumber) {
                if (thirdNumber > fourthNumber) {
                    if (thirdNumber > fifthNumber){
                        System.out.println("The Largest number is: " + thirdNumber);
                    return thirdNumber;
                    }
                }
            }
        }

        if (fourthNumber > firstNumber) {
            if (fourthNumber > secondNumber) {
                if (fourthNumber > thirdNumber) {
                    if (fourthNumber > fifthNumber){
                        System.out.println("The Largest number is: " + fourthNumber);
                    return fourthNumber;
                    }
                }
            }

        }

        if (fifthNumber > firstNumber) {
            if (fifthNumber > secondNumber) {
                if (fifthNumber > thirdNumber){
                    if (fifthNumber > fourthNumber) {
                        System.out.println("The Largest number is: " + fifthNumber);
                        return fifthNumber;
                    }

            }
        }
    }
        return 0;
    }

    public int smallestInteger() {
        if(firstNumber < secondNumber) {
            if (firstNumber < thirdNumber) {
                if (firstNumber < fourthNumber) {
                    if (firstNumber < fifthNumber){
                        System.out.println ("The Largest number is: " + firstNumber);
                        return firstNumber;
                    }
                }
            }
        }

        if(secondNumber < firstNumber) {
            if (secondNumber < thirdNumber) {
                if (secondNumber < fourthNumber) {
                    if (secondNumber < fifthNumber) {
                        System.out.println("The Largest number is: " + secondNumber);
                        return secondNumber;
                    }
                }
            }
        }

        if(thirdNumber < firstNumber) {
            if (thirdNumber < secondNumber) {
                if (thirdNumber < fourthNumber) {
                    if (thirdNumber < fifthNumber) {
                        System.out.println("The Largest number is: " + thirdNumber);
                        return thirdNumber;
                    }
                }
            }
        }

        if(fourthNumber < firstNumber) {
            if (fourthNumber < secondNumber) {
                if (fourthNumber < thirdNumber) {
                    if (fourthNumber < fifthNumber){
                        System.out.println("The Largest number is: " + fourthNumber);
                        return fourthNumber;
                    }
                }
            }

        }

        if(fifthNumber < firstNumber) {
            if (fifthNumber < secondNumber) {
                if (fifthNumber < thirdNumber) {
                    if (fifthNumber < fourthNumber){
                        System.out.println ("The Largest number is: " + fifthNumber);
                        return fifthNumber;
                    }

                }
            }
        }
        return 0;
    }
}
