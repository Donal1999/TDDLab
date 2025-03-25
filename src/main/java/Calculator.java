public class Calculator {
    public int add(int firstNum, int secondNum){
        long result = (long) firstNum + secondNum;
        if (result > Integer.MAX_VALUE){
            throw new IllegalArgumentException("Your values are to big");
        }
        return (int) result;
    }

    public int subtract(int firstNum, int secondNum){

        int result = firstNum - secondNum;
        if(result < 0 ){
            throw new IllegalStateException("negative results not allowed");
        }
        return result;
    }
    public int divide(int firstNum, int secondNum){

        if (secondNum == 0){
            throw new ArithmeticException("can't / by zero");
        }
        int result = firstNum/ secondNum;
        return result;

    }

    public int multiply(int firstNum,int secondNum){
        // overflow check
        // if the first number is greater than the MAX integer value divided second number the multiplication will overflow
        if (firstNum > 0 && secondNum > 0 && firstNum> Integer.MAX_VALUE/ secondNum ){ // if the
            throw new UnsupportedOperationException("Multiplication overflow");
        }
        if (firstNum < 0 && secondNum < 0 && firstNum < Integer.MAX_VALUE/ secondNum ){ // negative numbers
            throw new UnsupportedOperationException("Multiplication overflow");
        }
        if (firstNum > 0 && secondNum < 0 && secondNum > Integer.MIN_VALUE/ firstNum ){
            throw new UnsupportedOperationException("Multiplication overflow");
        }
        if (firstNum < 0 && secondNum > 0 && firstNum <  Integer.MAX_VALUE/ secondNum ){
            throw new UnsupportedOperationException("Multiplication overflow");
        }
        return firstNum * secondNum;
    }
}
