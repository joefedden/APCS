import java.util.Scanner;

public class Gauss {
    public static void main(String[] args) {
        Scanner whichlunch = new Scanner(System.in);
        int alpha, bravo, charlie, 
            delta, echo, golf, 
            hotel, juliett, kilo, 
            mike, romeo, november, papa;
        int year;
        String date;
        
        System.out.println ("Enter a year: ");
        year = whichlunch.nextInt();
        
        alpha = year % 19; 
        bravo = year / 100;
        charlie = year % 100;
        delta = bravo / 4;
        echo = bravo % 4;
        golf = (8 * bravo + 13) / 25;
        hotel = (19 * alpha + bravo - delta - golf + 15) % 30;
        juliett = charlie / 4;
        kilo = charlie % 4;
        mike = (alpha + 11 * hotel) / 319;
        romeo = (2 * echo + 2 * juliett - kilo - hotel + mike + 32) % 7;
        november = (hotel - mike + romeo + 90) / 25;
        papa = (hotel - mike + romeo + november + 19) % 32;
        
        date = november + "/" + papa + "/" + year;
        
        System.out.println("Easter will fall on " + date);
    }
}