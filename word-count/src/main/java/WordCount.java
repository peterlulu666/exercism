import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    String sentence = "";

    public WordCount() {

    }


    public String[] cleanWords() {
        // String to array of character
        this.sentence = this.sentence.toLowerCase();
        char[] letterArr = new char[this.sentence.length()];
        for (int i = 0; i < this.sentence.length(); i++) {
            if (Character.isAlphabetic(this.sentence.charAt(i)) ||
                    Character.isDigit(this.sentence.charAt(i)) ||
                    this.sentence.substring(i, i + 1).equals("'")) {
                letterArr[i] = this.sentence.charAt(i);

            } else {
                letterArr[i] = ' ';

            }

        }
        // Join
        String wordString = "";
        String separator = "";
        for (int i = 0; i < letterArr.length; i++) {
            if (i < letterArr.length - 1) {
                wordString = wordString + (letterArr[i] + separator);

            } else {
                wordString = wordString + letterArr[i];

            }

        }
//        // Split
//        String[] wordArr = wordString.replace(" '", "").replace("' ", "").trim().split(" ");
//        System.out.println(Arrays.toString(wordArr));
//        int countEmpty = 0;
//        for (int i = 0; i < wordArr.length; i++) {
//            if (wordArr[i].equals("")) {
//                countEmpty++;
//
//            }
//
//        }
//        String[] pureWordArr = new String[wordArr.length - countEmpty];
//        for (int i = 0; i < pureWordArr.length; i++) {
//            int j = i;
//            while (j < wordArr.length) {
//                if (wordArr[j].equals("")){
//                    j++;
//                    continue;
//
//                }
//                pureWordArr[i] = wordArr[j];
//                break;
//
//            }
//
//        }
//        return pureWordArr;
        // Split
        // Strip
        String[] wordArr = wordString.replace(" '", "").replace("' ", "").trim().split(" ");

        return wordArr;
    }

    public List<String> arrayToList(String[] wordArr) {
        List<String> list = new ArrayList<String>(Arrays.asList(wordArr));
        list.removeAll(Arrays.asList("", null));
        return list;

    }

//    public List<String> cleanWords() {
//        String wordString = this.sentence.toLowerCase()
//                .replaceAll("[^a-z0-9']", " ")
//                .replaceAll("(?:^|\\s)'|'(?:\\s|$)", " ")
//                .trim();
//        // Split
//        String[] wordArr = wordString.split(" ");
//        // Array to list
//        List<String> list = new ArrayList<String>(Arrays.asList(wordArr));
//        list.removeAll(Arrays.asList("", null));
//        return list;
//    }

    public Map<String, Integer> countFrequency(ArrayList<String> wordList) {
        // hashmap to store the frequency of element
        Map<String, Integer> counter = new HashMap<String, Integer>();

        for (String word : wordList) {
            Integer count = counter.get(word);
            // If word is not in hashMap
            // If counter.get(word) return null, the word is not in hashMap
            if (count == null){
                counter.put(word, 1);

            }
            else {
                counter.put(word, count + 1);

            }
        }


        // displaying the occurrence of elements in the arraylist
        return counter;
//        String wordsFrequency = "";
//        for (Map.Entry<String, Integer> val : hashMap.entrySet()) {
//            wordsFrequency = wordsFrequency + val.getKey() + " : " + val.getValue() + "\n";
//
//        }
//        return wordsFrequency;

    }

    public Map<String, Integer> countFrequencies(String[] wordArray) {
        return Arrays.asList(wordArray).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(i -> 1)));

    }

    public Map<String, Integer> phrase(String sentence) {
        this.sentence = sentence;
        var wordArray = cleanWords();
        var list = arrayToList(wordArray);
        return countFrequency((ArrayList<String>) list);
//        return countFrequencies(wordArray);

    }

    public static void main(String[] args) {
        String sentence = "That's the password: 'PASSWORD 123'!\", cried the Special Agent.\nSo I fled";
        var wordCount = new WordCount();
        System.out.println(wordCount.phrase(sentence));


    }
}
