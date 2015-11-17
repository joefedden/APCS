public class Drunkard {
    public static void main (String[] args) {
        int x = 0, y = 0;
        int random = (int) Math.floor(Math.random() * 100);
        
        for (int i = 0; i < 100; i++) {
            if ((random >= 0 ) && (random < 25)) {
                x++;
            } else if ((random >= 25) && (random < 50)) {
                x--;
            } else if ((random >= 50 ) && (random < 75)) {
                y++;
            } else {
                y--;
            }
            
            random = (int) Math.floor(Math.random()  * 100);
        }
        
        System.out.println("This final location is: (" + x + "," + y + ")");
    }
}