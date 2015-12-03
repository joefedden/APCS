public class Die {
    public static void main(String[] args) {
        boolean inRun = false;
        int[] die = new int[20];
        
        for (int i = 0; i < die.length; i++) {
            int randNum = (int) Math.floor(Math.random()*6) + 1;
            die[i] = randNum;
        }
        	
        for (int i = 0; i < die.length; i++) {
            if (inRun) {
                if (die[i] != die[i-1]) {
                    System.out.print(")");
                    inRun = false;
                }
            }
            if (!inRun) {
                if (i < 19) {
                    if (die[i] == die[i + 1]) {
                        System.out.print("(");
                        inRun = true;
                    }
                }
            }
            System.out.print(die[i] + " ");
        }
    }
}
