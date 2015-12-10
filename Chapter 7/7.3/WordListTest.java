import java.util.ArrayList;

public class WordListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new <String>ArrayList();
        
        list.add("Nick");
        list.add("Danny");
        list.add("Joe");
        list.add("Cam");
        list.add("Collin");
        list.add("Mike");
        list.add("Peter");
        WordList names = new WordList(list);
        
        names.printList();
        System.out.print("Words of 4 letter words in the list: " + names.numWordsOfLength(4));
        names.removeWordsOfLength(4);
        System.out.print("\nWords of 4 letters removed: ");
        names.minAndMax();
        names.printList();
    }
}