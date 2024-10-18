package Methods;

public class StringAnalyzer {

    public int countLetterA(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }
}
