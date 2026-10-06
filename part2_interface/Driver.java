package part2_interface;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        ArrayList<Payable> payables = new ArrayList<>();

        payables.add(new Freelancer(
                "Alice",
                "Kim",
                30.00,
                35
        ));

        payables.add(new Freelancer(
                "Brian",
                "Lee",
                25.00,
                45
        ));

        payables.add(new VendorInvoice(
                "Acme Supplies",
                "A100",
                850.00
        ));

        payables.add(new VendorInvoice(
                "Office Depot",
                "B205",
                425.50
        ));

        double totalPayout = 0;

        for (Payable payable : payables) {

            if (payable instanceof Freelancer) {
                ((Freelancer) payable).print();
            } else if (payable instanceof VendorInvoice) {
                ((VendorInvoice) payable).print();
            }

            totalPayout += payable.calculatePayment();
        }

        System.out.printf("%nTotal payout: $%.2f%n", totalPayout);
    }
}