package Task2;


public class Methods {


    private double a;
    private double b;

    public Methods(int a, int b) {

        this.a = a;
        this.b = b;
    }


    public void throwException() throws IllegalAccessException, MyException {
        if (a < 0 && b < 0)
            throw new IllegalArgumentException();
        else if (a == 0 && b != 0)
            throw new ArithmeticException();
        else if (a != 0 && b == 0)
            throw new ArithmeticException();
        else if (a == 0 && b == 0)
            throw new IllegalAccessException();
        else if (a > 0 && b > 0)
            throw new MyException("Error");
    }

    public double suma() throws MyException, IllegalAccessException {
        this.throwException();
        return a + b;
    }

    public double minus() throws MyException, IllegalAccessException {
        this.throwException();
        return a - b;
    }

    public double devide() throws MyException, IllegalAccessException {
        this.throwException();
        return a / b;
    }

    public double multiple() throws MyException, IllegalAccessException {
        this.throwException();
        return a * b;
    }


}
