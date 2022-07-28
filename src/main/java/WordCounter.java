import java.util.HashMap;
import java.util.Locale;
import java.util.StringTokenizer;

public class WordCounter {
    StringTokenizer str;
    HashMap<String, Integer> hm = new HashMap<>();
    public WordCounter(String inputString) {
        str = new StringTokenizer(inputString);
    }

    public void countWords() {
        String eachWord = "";
        int value = 0;

        while(str.hasMoreTokens()){
            eachWord = str.nextToken().toLowerCase();
            if(!hm.containsKey(eachWord)){
                value++;
                hm.put(eachWord, value);
            }
            else{
                value = hm.get(eachWord) + 1;
                hm.replace(eachWord, value);
            }
            value = 0;
        }
    }

    public String getWordCount() {
        String output = "";
        for(String key : hm.keySet()){
            output += key + " " + hm.get(key) + "\n";
        }
        return output;
    }
}
