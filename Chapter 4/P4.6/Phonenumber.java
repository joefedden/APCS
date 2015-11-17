import java.util.*;

public class Phonenumber {
    public static void main(String[] args) {
        Scanner mocha = new Scanner(System.in);
        String phonenumber, first, middle, end;
        
        System.out.println("Enter a raw phonenumber: ");
        phonenumber = mocha.next();
        
        first = phonenumber.substring(0,3);
        middle = phonenumber.substring(3,6);
        end = phonenumber.substring(6,10);
        
        System.out.println("(" + first + ") " + middle + "-" + end);
    }
}