public class CreditPaymentService {
    public double calculate(double amountOfCredit, double creditTerm, double creditRate) {
        double loanRatePerMonth = (creditRate / 100) / 12;
        double monthlyPayment = amountOfCredit * (loanRatePerMonth + (loanRatePerMonth /
                (Math.pow( 1 + loanRatePerMonth, creditTerm) - 1)));

        return monthlyPayment;
    }
}