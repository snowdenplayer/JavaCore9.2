public class Methods {

    static double a;
    static double b;
    static double result;

    Methods(double a, double b) throws MyException {
        this.a = a;
        this.b = b;

    }

    double addNumbers() throws MyException {
        Methods.check();

        return a + b;

    }

    double minus() throws MyException {
        Methods.check();
        return a - b;
    }

    double multiply() throws MyException {
        Methods.check();
        return a * b;
    }

    double divide() throws MyException {
        Methods.check();
        return a / b;
    }

    static void check() throws MyException {

        if (a < 0 || b < 0 || (a == 0 && b == 0)) {

            throw new IllegalArgumentException();
        }
        if (a == 0 && b != 0 || (a != 0 && b == 0)) {
            throw new ArithmeticException();
        }
        if (a > 0 && b > 0) {
            String mes = "It`s wrang";
            throw new MyException(mes);
        }
    }
}
