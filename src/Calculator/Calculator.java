package Calculator;

import java.math.*;

public class Calculator {
    int num1, num2, num3;

    public Calculator(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    public int getSum() {
        return num1 + num2 + num3;
    }

    public int getProduct() {
        return num1 * num2 * num3;
    }

    public int getAverage() {
        double avrg = getSum() / 3;
        return (int) Math.round(avrg);
    }

    public int getSmallest() {
        int temp = Math.min(num1, num2);
        temp = Math.min(temp, num3);
        return temp;
    }

    public int getLargest() {
        int temp = Math.max(num1, num2);
        temp = Math.max(temp, num3);
        return temp;
    }




}
