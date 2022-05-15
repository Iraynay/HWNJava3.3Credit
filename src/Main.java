public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment12 = service.calculate (1_000_000, 12);
        int payment121 = (int) payment12;
        System.out.println("Ежемесячный платеж: " + payment121);

        double payment24 = service.calculate(1_000_000, 24);
        int payment241 = (int) payment24;
        System.out.println("Ежемесячный платеж: " + payment241);

        double payment36 = service.calculate(1_000_000, 36);
        int payment361 = (int) payment36;
        System.out.println("Ежемесячный платеж: " + payment361);



    }
}
