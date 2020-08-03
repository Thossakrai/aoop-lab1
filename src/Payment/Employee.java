package Payment;

public class Employee {
    int hours;
    double basePay;

    Employee(double basePay, int hours) {
        this.basePay = basePay;
        this.hours = hours;
    }

    public double getBasePay() {
        return basePay;
    }

    public int getHours() {
        return hours;
    }
}
