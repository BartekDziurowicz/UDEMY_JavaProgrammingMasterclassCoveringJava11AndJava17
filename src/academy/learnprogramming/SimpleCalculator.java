package academy.learnprogramming;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return getFirstNumber()+getSecondNumber();
    }

    public double getSubtractionResult(){
        return getFirstNumber()-getSecondNumber();
    }

    public double getMultiplicationResult(){
        if (getFirstNumber()==0 || getSecondNumber()==0) {
            return 0;
        } else {
            return getFirstNumber()*getSecondNumber();
        }
    }

    public double getDivisionResult(){
        if (getFirstNumber()==0 || getSecondNumber()==0) {
            return 0;
        } else {
            return getFirstNumber()/getSecondNumber();
        }

    }
}
