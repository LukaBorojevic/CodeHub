public class CamelCase {
    public int camelCase(String sentence ){
        int wordCount = 1;
        int index = 0;
        while (index < sentence.length()) {
            if (Character.isUpperCase(sentence.charAt(index))) {
                wordCount++;
            }
            index++;
        }
        return wordCount;
    }
}
