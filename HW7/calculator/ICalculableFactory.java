package HW7.calculator;

import HW7.complex.Complex;

public interface ICalculableFactory {
    Calculable create(Complex firstArg);
}