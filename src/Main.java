public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        float monthlyPayment = service.calculate(1_000_000, 24);
        String result = String.format("%.0f", monthlyPayment);
        System.out.println("Ежемесячный платеж составит: " + result + " рублей");
    }
}
