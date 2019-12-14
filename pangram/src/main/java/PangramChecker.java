public class PangramChecker {

    public boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        var alphabetSplit = new String[alphabet.length()];
        alphabetSplit = alphabet.split("");
        for (int i = 0; i < alphabet.length(); i++) {
            // a is in sentence
            // b is in sentence
            // c is in sentence
            if (!(sentence.contains(alphabetSplit[i]))){
                return false;

            }

        }

        return true;

    }

}
