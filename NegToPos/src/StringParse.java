import java.util.ArrayList;

public class StringParse {
    public static ArrayList<String> sentenceToArrayList(String sentence) {
        ArrayList<String> splitSentence = new ArrayList<>();
        sentence = sentence.trim();
        sentence = sentence.toLowerCase();

        while (!sentence.isEmpty()) {
            int spaceIndex = sentence.indexOf(" ");

            if (spaceIndex == -1) {
                splitSentence.add(sentence);
                break;
            }

            String word = sentence.substring(0, spaceIndex);
            if (!word.isEmpty()) {
                splitSentence.add(word);
            }

            sentence = sentence.substring(spaceIndex + 1).trim();
        }

        return splitSentence;
    }
}
