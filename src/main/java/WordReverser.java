import java.util.Stack;
import java.util.StringTokenizer;

public class WordReverser {

    String input;
    Stack<String> inputString = new Stack<>();

    public WordReverser(String input) {
        this.input = input;
    }

    public void reverseWords() {
        StringTokenizer st = new StringTokenizer(input);
        while(st.hasMoreTokens()){
            String word = st.nextToken();
            inputString.push(word);
        }
    }

    public String getReversedWords() {
        String output = "";
        while(!inputString.empty()){
            output += inputString.pop() + " ";
        }
        return output;
    }

    public int getWordCount() {
        StringTokenizer st = new StringTokenizer(input);
        return st.countTokens();
    }
}
