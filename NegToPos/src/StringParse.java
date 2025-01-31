import java.util.ArrayList;

public class StringParse {
    public static ArrayList<String> sentanceToArrayList(String sentence){
        ArrayList<String> splitSentence  = new ArrayList<String>();
        while(sentence.indexOf(" ") > -1){
            int endSpace = sentence.indexOf(" ");
            String word = sentence.substring(0,endSpace);
            if(word.indexOf(".") > -1){
                word.substring(0,endSpace-1);
            }
            sentence = sentence.substring(endSpace);

            splitSentence.add(word);
            System.out.println(word);

        }
        return splitSentence;
    }
}
