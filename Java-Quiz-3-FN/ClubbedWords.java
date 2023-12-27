import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ClubbedWords {
    public static List<String> findClubbedWords(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String combined = words[i] + words[j];
                if (isClubbedWord(combined, Arrays.copyOfRange(words, 0, i)) ||
                    isClubbedWord(combined, Arrays.copyOfRange(words, i + 1, words.length))) {
                    result.add(combined);
                }
            }
        }
        return result;
    }
    private static boolean isClubbedWord(String word, String[] dictionary) {
        for (String w : dictionary) {
            if (word.contains(w)) {
                word = word.replaceFirst(w, "");
            }
        }
        return word.isEmpty();
    }
    public static void main(String[] args) {
        String[] words = {"mat", "mate", "matbellmates", "bell", "bellmatesbell", "butterribbon", "butter", "ribbon"};
        List<String> clubbedWords = findClubbedWords(words);
        System.out.println("Clubbed Words: " + clubbedWords);
    }
}
