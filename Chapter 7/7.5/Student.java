
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    private double[] scores;
    private int scoresSize;

    public Student(int capacity)
    {
        scores = new double[capacity];
        scoresSize = 0;
    }

    public boolean addScore(double score)
    {
        if( scoresSize >= scores.length ) return false;
        scores[scoresSize] = score;
        scoresSize++;
        return true;
    }

    public double sum()
    {
        if(scoresSize == 0)
        {
            return 0.0;
        }
        if(scores.length == 1)
        {
            return scores[0];
        }
        double sum = scores[0];
        for(int i = 1; i < scoresSize; i++)
        {
            sum += scores[i];
        }
        return sum;
    }

    public double minimum()
    {
        if(scoresSize == 0)
        {
            return 0.0;
        }
        if(scores.length == 1)
        {
            return scores[0];
        }
        double minimum = scores[0];
        for(int i = 1; i < scoresSize; i++)
        {
            if(scores[i] < minimum)
            {
                minimum = scores[i];
            }
        }
        return minimum;
    }

    public double finalScore() 
    {
        if (scoresSize == 0)
        {
            return 0;
        }
        else if (scores.length == 1)
        {
            return scores[0];
        }
        else
        {
            return sum() - minimum();
        }
    }
    
    public void removeMin() {
        double min = scores[0];
        int mindex = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
                mindex = i;
            }
        }
        
        for (int i = mindex; i < scores.length - 1; i++) {
            scores[i] = scores[i+1];
        }
        scores[scores.length - 1] = 0;
    }
    
    public void printScores() {
        for (double score: scores) {
            System.out.print(score + " ");
        }
    }
}