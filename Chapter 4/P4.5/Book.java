public class Book {
    private double bookPrice, totalPrice, bookTax;
    private static final double TAX = 7.5;
    private static final double SHIPPING = 2;
    
    public Book(double bookPrice) {
        this.bookPrice = bookPrice;
    }
    
    public void setTax() {
        bookTax = (bookPrice * TAX) / 100;
    }
    
    public void addTax() {
        totalPrice = (bookTax + bookPrice) + totalPrice;
    }
    
    public void setShipping() {
        totalPrice = SHIPPING + totalPrice; 
    }
    
    public String recipt() {
        String recipt = "Book Price: $" + bookPrice + 
                        "\nTax: $" + bookTax + 
                        "\nShipping: $"  + SHIPPING + 
                        "\nTotal: $" + totalPrice;
        
        return recipt;
    }
}