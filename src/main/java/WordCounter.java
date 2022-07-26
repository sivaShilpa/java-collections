public class WordCounter {

    String inputString;
    public WordCounter(String inputString) {
        this.inputString = inputString;
    }

    public void countWords() {
        int wordCounter = 0;
        for(char ch : inputString.toCharArray()){
            if(ch == ' '){
                wordCounter++;
            }
        }
    }

    public int getWordCount() {

        return 0;
    }
}
