import java.util.Scanner;

public class Velocity {
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		Velocity vel = new Velocity();
		final double DELTA_T = 0.01;
		double position = 0, velocity = 0, time = 0, gravity = 9.81;
		double standardEquation = (0.5 * gravity * Math.pow(time, 2)) + (velocity * time);
		Scanner huerta = new Scanner(System.in);
		int x = 1, y = 2;
		
		System.out.print("Enter a velocity: ");
		velocity = huerta.nextDouble();
		
		for (int i = 0; i < 100; i++) {
			velocity = velocity - gravity * DELTA_T;
			position = position + velocity * DELTA_T;
			time = Math.abs(Math.cbrt((position-velocity) / (-0.5 * gravity)));
			
			standardEquation = (0.5 * gravity * Math.pow(time, 2)) + (velocity * time);
		}
		
		System.out.println("Accurate Position: " + position);
		System.out.println("Standard Equation Position: " + standardEquation);
		System.out.println(vel.add(x,y));
	}
}