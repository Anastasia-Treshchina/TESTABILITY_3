public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        float monthlyPayment_12 = service.calculate(1_000_000, 12, 9.99f);
        String result_12 = String.format("%.0f", monthlyPayment_12);
        System.out.println("Ежемесячный платеж составит: " + result_12 + " рублей");

        float monthlyPayment_24 = service.calculate(1_000_000, 24, 9.99f);
        String result_24 = String.format("%.0f", monthlyPayment_24);
        System.out.println("Ежемесячный платеж составит: " + result_24 + " рублей");

        float monthlyPayment_36 = service.calculate(1_000_000, 36, 9.99f);
        String result_36 = String.format("%.0f", monthlyPayment_36);
        System.out.println("Ежемесячный платеж составит: " + result_36 + " рублей");
    }
}
