import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Acronym {

    String phrase = "";

    Acronym(String phrase) {
        this.phrase = phrase;

    }

    String get() {
        var wordArr = cleanWordsToArr();
        String abbreviate = "";
        for (int i = 0; i < wordArr.length; i++) {
            abbreviate = abbreviate + wordArr[i].charAt(0);

        }
        return abbreviate;
//        var wordArr = cleanWords();
//        var wordList = arrayToList(wordArr);
//        String abbreviate = "";
//        for (int i = 0; i < wordList.size(); i++) {
//            abbreviate = abbreviate + wordList.get(i).charAt(0);
//
//        }
//        return abbreviate;

    }

    public String[] cleanWords() {
        String words = this.phrase.toUpperCase();
        char[] letterArr = new char[words.length()];
        for (int i = 0; i < words.length(); i++) {
            if (Character.isAlphabetic(words.charAt(i)) ||
                    words.charAt(i) == ' ') {
                letterArr[i] = words.charAt(i);

            } else if (words.charAt(i) == '_') {
                letterArr[i] = ' ';

            } else {
                letterArr[i] = ' ';

            }

        }
        // Join
        String wordString = "";
        String separator = "";
        for (int i = 0; i < letterArr.length; i++) {
            wordString = wordString + (letterArr[i] + separator);

        }
        // Split
        var wordArray = wordString.trim().split(" ");

        return wordArray;

    }

//    public String[] cleanWords() {
//        String wordString = this.phrase.toUpperCase()
//                .replaceAll("[^A-Z0-9']", " ")
//                .replaceAll("(?:^|\\s)'|'(?:\\s|$)", " ")
//                .trim();
//        // Split
//        String[] wordArr = wordString.split(" ");
//
//        return wordArr;
//
//    }

    public String[] cleanWordsToArr() {
        String words = this.phrase.toUpperCase();
        char[] letterArr = new char[words.length()];
        for (int i = 0; i < words.length(); i++) {
            if (Character.isAlphabetic(words.charAt(i)) ||
                    words.charAt(i) == ' ') {
                letterArr[i] = words.charAt(i);

            } else if (words.charAt(i) == '_') {
                letterArr[i] = ' ';

            } else {
                letterArr[i] = ' ';

            }

        }
        // Join
        String wordString = "";
        String separator = "";
        for (int i = 0; i < letterArr.length; i++) {
            wordString = wordString + (letterArr[i] + separator);

        }
        // Split
        var wordArray = wordString.trim().split(" ");
        // Remove space in array
        int countEmpty = 0;
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].equals("")) {
                countEmpty++;

            }

        }
        String[] pureWordArr = new String[wordArray.length - countEmpty];
        for (int i = 0; i < pureWordArr.length; i++) {
            int j = i;
            while (j < wordArray.length) {
                if (wordArray[j].equals("")) {
                    j++;
                    continue;

                }
                pureWordArr[i] = wordArray[j];
                break;

            }

        }
        return pureWordArr;

    }

    // Array to list
    // Remove space in array
    public List<String> arrayToList(String[] wordArr) {
        List<String> wordList = new ArrayList<String>(Arrays.asList(wordArr));
        wordList.removeAll(Arrays.asList("", null));
        return wordList;

    }


    public static void main(String[] args) {
        var acronym = new Acronym("a     baa  c");
        System.out.println(Arrays.toString(acronym.cleanWords()));
        System.out.println(acronym.arrayToList(acronym.cleanWords()));
        var wordsList = acronym.arrayToList(acronym.cleanWords());
        System.out.println(wordsList.get(1).charAt(0));
        System.out.println(wordsList.size());


    }

}
