import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> wordTranslations;

    public DictionaryOfManyTranslations() {
        this.wordTranslations = new HashMap<>();
    }
    public void add(String word, String translation) {
        // an empty list has to be added for a new word if one has not already been added
        wordTranslations.putIfAbsent(word, new ArrayList<>());
        wordTranslations.get(word).add(translation);
    }
    public ArrayList<String> translate(String word) {
        return wordTranslations.getOrDefault(word, new ArrayList<>());
    }
    public void remove(String word) {
        wordTranslations.remove(word);
    }
}
