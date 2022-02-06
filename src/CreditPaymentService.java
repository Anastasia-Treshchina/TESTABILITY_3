public class CreditPaymentService {
    public float calculate(float amountOfCredit, float creditTerm, float creditRate) {
        float loanRatePerMonth = (creditRate / 100) / 12;
        float monthlyPayment = amountOfCredit * (loanRatePerMonth + (loanRatePerMonth /
                (((float) Math.pow( 1 + loanRatePerMonth, creditTerm) - 1))));

        return monthlyPayment;
    }
}