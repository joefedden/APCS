public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book(15.50);
        
        book1.setTax();
        book1.addTax();
        book1.setShipping();
        
        System.out.println(book1.recipt());
    }
}