package Payment;

public class Payment {
    public void getPayment(double basePay, int hours) {
        if (basePay < 8.00) {
            System.out.println("Base pay must be >= 8.00");
        } else if (hours > 60) {
            System.out.println("Hour worked must be <=60");
        } else {
            double totalWage = hours * basePay;
            if (hours > 40) {
                int overtime = hours - 40;
                totalWage += overtime * basePay * 1.5;
            }
            System.out.println("Pay $" + totalWage);
        }

    }
}
