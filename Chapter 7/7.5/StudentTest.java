public class StudentTest {
    public static void main(String[] args) {
        Student joe = new Student(5);
        
        joe.addScore(95.7);
        joe.addScore(78.2);
        joe.addScore(67.4);
        joe.addScore(86.78);
        joe.addScore(98.23);
        
        joe.printScores();
        
        System.out.print("\n");
        joe.removeMin();
        joe.printScores();
    }
}