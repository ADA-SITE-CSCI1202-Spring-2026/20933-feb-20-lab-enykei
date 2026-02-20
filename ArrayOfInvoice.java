import java.util.Scanner;

public class ArrayOfInvoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of invoice items: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        Invoice[] invoices = new Invoice[size];

        for (int i = 0; i < invoices.length; i++) {
            System.out.println("\n--- Item " + (i + 1) + " ---");

            System.out.print("Enter Part Number: ");
            String partNum = scanner.nextLine();

            System.out.print("Enter Description: ");
            String desc = scanner.nextLine();

            System.out.print("Enter Quantity: ");
            int qty = scanner.nextInt();

            System.out.print("Enter Price per Item: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            invoices[i] = new Invoice(partNum, desc, qty, price);
        }

        System.out.println("\n--- FINAL INVOICE SUMMARY ---");
        for (int i = 0; i < invoices.length; i++) {
            Invoice current = invoices[i];
            double amount = current.getQuantity() * current.getPricePerItem();
            System.out.println("Part: " + current.getPartNumber() + " | Description: " + current.getPartDescription()
                    + " | Amount: $" + amount);
        }
        scanner.close();
    }
}