public class Main {
    public static void main(String[] args) {
      CreditPaymentService service = new CreditPaymentService();

        long monthlyPayment1 = (long) service.calculate(1_000_000,  9.99F, 1);
        System.out.println(monthlyPayment1);

        long monthlyPayment2 = (long) service.calculate(1_000_000,  9.99F, 2);
        System.out.println(monthlyPayment2);

        long monthlyPayment3 = (long) service.calculate(1_000_000,  9.99F, 3);
        System.out.println(monthlyPayment3);

    }
}
