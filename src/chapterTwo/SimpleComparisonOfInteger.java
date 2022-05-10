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
        return null;
    }
}
