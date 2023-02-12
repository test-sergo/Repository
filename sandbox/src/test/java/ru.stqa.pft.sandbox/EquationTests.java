package test.java.ru.stqa.pft.sandbox;

import main.java.ru.stqa.pft.sandbox.Equation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTests {

    @Test
    public void test0() {
        Equation e = new Equation(1, 1, 1);
        Assert.assertEquals(e.rootNumder(), 0);
    }

    @Test
    public void test1() {
        Equation e = new Equation(1, 2, 1);
        Assert.assertEquals(e.rootNumder(), 1);
    }

    @Test
    public void test2() {
        Equation e = new Equation(1, 5, 6);
        Assert.assertEquals(e.rootNumder(), 2);
    }
}
