package Calculator.operations;

import Calculator.Calc;
import Calculator.ExcepTest;

public class Div extends Calc {
    public Div(double a, double b) {
        super(a, b);
    }
    @Override
    public double action () throws ExcepTest {
        if(b!=0) {
            return a/b;
        }else {
            System.out.println("Деление на ноль невозможно!");
            throw new ExcepTest(b);
        }

    }
}
