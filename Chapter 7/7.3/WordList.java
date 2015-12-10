import java.util.ArrayList;

public class WordList {
    private ArrayList<String> myList;

    public WordList (ArrayList<String> myList) {
        this.myList = myList;
    }

    public int numWordsOfLength(int len) {
        int numOfWords = 0;
        for (String word: myList) {
            if (word.length() == len) {
                numOfWords++;
            } 
        }return numOfWords;
    }

    public void removeWordsOfLength(int len) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() == len) {
                myList.remove(i);
            }
        }
    }

    public void printList() {
        System.out.println(myList);
    }

    public void minAndMax() {
        int minLen = myList.get(0).length();
        int maxLen = myList.get(0).length();
        int mindex = 0, maxdex = 0;
        String max = " ", min = " ";

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() < minLen) {
                min = myList.get(i);
                mindex = i;
            }

            if (myList.get(i).length() > maxLen) {
                max = myList.get(i);
                maxdex = i;
            }
        }
            String minFinal = min + "(Min)";
            String maxFinal = max + "(Max)";
            myList.set(mindex, minFinal);
            myList.set(maxdex, maxFinal);
    }
}