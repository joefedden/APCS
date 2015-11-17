public class ChangeTest
{
    public static void main(String[] args) {
        Change change1 = new Change(500, 387);
        
        change1.setDollars();
        change1.setQuarters();
        change1.setDimes();
        change1.setNickels();
        change1.setPennies();
        
        System.out.println(change1.getDollars());
        System.out.println(change1.getQuarters());
        System.out.println(change1.getDimes());
        System.out.println(change1.getNickels());
        System.out.println(change1.getPennies());
    }
}
