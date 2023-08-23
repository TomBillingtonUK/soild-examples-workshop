package singleResponsibility;

public class Invoice {
    private Book book;
    private int quantity;

    public Invoice(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return this.book.getPrice() * this.quantity;
    }

    public void printInvoice() {
        System.out.println(quantity + "x " + book.getName() + " £" + book.getPrice());
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }
}