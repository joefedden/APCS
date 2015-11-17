import java.util.Scanner;

public class EscapeVelocity {
    public static void main(String[] args) {
        Scanner eoj = new Scanner(System.in);
        final double GRAVITY = 6.67 * Math.pow(10,-11);
        final double MASS = 1.3 * Math.pow(10,22);
        final double RADIUS = 1.153 * Math.pow(10,6);
        final double ESCAPEV = Math.sqrt(2 * ((GRAVITY * MASS) / RADIUS));
        
        double input = 0, newMass;
        
        System.out.println("Enter a velocty");
        input = eoj.nextDouble();
        
        System.out.println("Your velocity: " + input);
        System.out.println("Escape velocity: " + ESCAPEV);
        
        if (input >= ESCAPEV) {
            System.out.println("You will leave the comet");
            newMass = ((Math.pow(input,2) * RADIUS) / (GRAVITY * 2));
            System.out.println("To stay on the comet, its new mass would have to be: " + newMass + " kg");
        } else {
            System.out.println("You will stay on the comet");
        }
    }
}