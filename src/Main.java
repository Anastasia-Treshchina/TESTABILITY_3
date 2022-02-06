public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPayment_12 = service.calculate(1_000_000, 12, 9.99);
        String result_12 = String.format("%.0f", monthlyPayment_12);
        System.out.println("Ежемесячный платеж составит: " + result_12 + " рублей");

        double monthlyPayment_24 = service.calculate(1_000_000, 24, 9.99);
        String result_24 = String.format("%.0f", monthlyPayment_24);
        System.out.println("Ежемесячный платеж составит: " + result_24 + " рублей");

        double monthlyPayment_36 = service.calculate(1_000_000, 36, 9.99);
        String result_36 = String.format("%.0f", monthlyPayment_36);
        System.out.println("Ежемесячный платеж составит: " + result_36 + " рублей");
    }
}
