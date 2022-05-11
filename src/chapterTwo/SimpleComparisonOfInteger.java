package chapterTwo;

public class SimpleComparisonOfInteger {
    private int integer;
    private int integerSquare;

    public SimpleComparisonOfInteger(int num) {
        integer = num;
        setIntegerSquare();
    }

    public int getInteger() {
        return integer;
    }

    public void setIntegerSquare(){
        integerSquare = integer * integer;
    }
    public int getIntegerSquare() {
        return integerSquare;
    }

    public String getComparison() {
        if(integer > 100){
            return "The Integer is greater than 100";
        }
        if(integer < 100){
            return "The Integer is lesser than 100";
        }
        if(integer == 100){
            return "The Integer is equal to 100";
        }
        if(integerSquare > 100){
            return "The Square of Integer is greater than 100";
        }
        if(integerSquare < 100){
            return "The Square of Integer is greater than 100";
        }
        if(integerSquare == 100){
            return "The Square of Integer is equal to 100";
        }
       return null;
    }
}
