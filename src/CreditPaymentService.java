public class CreditPaymentService {

    public double calculate(double sum, double term) {

        double procent;
        procent = 9.99;
        double repaid;
        repaid = 0;
        double balance;
        balance = sum - repaid;
        double monthlyRate;
        monthlyRate = 9.99 / (100 * 12);
        Denominator count = new Denominator();
        double a = 1 + monthlyRate;
        double b = -term;
        double denominator = count.denominator(a, b);
        double payment;
        payment = balance * (monthlyRate / (1 - denominator));
        return payment;
    }
}
// сумма 1_000_000 процент 9.99 срок 12 платеж 87911
//
