package Payment;

public class PaymentDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(7.50, 35);
        Employee emp2 = new Employee(8.2, 47);
        Employee emp3 = new Employee(10, 73);

        Payment payment = new Payment();
        payment.getPayment(emp1.basePay, emp1.hours);
        payment.getPayment(emp2.basePay, emp2.hours);
        payment.getPayment(emp3.basePay, emp3.hours);
    }
}
