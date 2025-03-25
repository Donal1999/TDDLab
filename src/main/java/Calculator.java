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
}
