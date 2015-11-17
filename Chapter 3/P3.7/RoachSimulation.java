public class RoachSimulation {
    public static void main(String [] args) {
        RoachPopulation pop = new RoachPopulation(10);
        
        System.out.println("Start: " + pop.getRoaches());
        pop.spray(10);
        System.out.println("10% gone: " + pop.getRoaches());
        pop.spray(10);
        System.out.println("10% gone: " + pop.getRoaches());
        pop.spray(10);
        System.out.println("10% gone: " + pop.getRoaches());
        pop.spray(10);
        System.out.println("10% gone: " + pop.getRoaches());
        pop.spray(10);
    }
}
