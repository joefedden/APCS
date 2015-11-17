public class ProductPrinter {
    public static void main(String [] args) {
        Product java = new Product("Java",20);
        Product python = new Product("Python",30);
        
        System.out.println("Product 1: " + java.getName());
        System.out.println("Product 1 price: " + java.getPrice());
        java.reducePrice(5);
        System.out.println("Product 1 after $5 price reduction: " + java.getPrice());
        
        System.out.println("\nProduct 2: " + python.getName());
        System.out.println("Product 2 price: " + python.getPrice());
        python.reducePrice(5);
        System.out.println("Product 2 after $5 price reduction: " + python.getPrice());
        
    }
}