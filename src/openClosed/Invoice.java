package openClosed;

public class Invoice {
    private Book book;
    private int quantity;

    public Invoice(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculateTotal() {
       return this.book.getPrice() * this.quantity;
    }


}
