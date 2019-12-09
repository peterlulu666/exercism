class ReverseString {

    String reverse(String inputString) {
        // String to string array
        String[] strSplit = inputString.split("");
        // Reverse
        // a b c d e
        for (int i = 0; i < (strSplit.length / 2); i++) {
            String temp = strSplit[i];
            // Shift
            strSplit[i] = strSplit[strSplit.length - 1 - i];
            // Replace
            strSplit[strSplit.length - 1 - i] = temp;

        }
        String reversedStr = "";
        for (int i = 0; i < strSplit.length; i++) {
            reversedStr = reversedStr + strSplit[i];

        }
        return reversedStr;

    }

    String reverseCharArr(String str) {
        String reversedStr = "";
        // String to character array
        char[] strChar = str.toCharArray();
        // Reverse
        // a b c d e
        for (int i = 0; i < (strChar.length / 2); i++) {
            char temp = strChar[i];
            // Shift
            strChar[i] = strChar[strChar.length - 1 - i];
            // Replace
            strChar[strChar.length - 1 - i] = temp;

        }
        String reversedString = "";
        for (int i = 0; i < strChar.length; i++) {
            reversedString = reversedString + strChar[i];

        }
        return reversedString;
    }

    String reverseStr(String str) {
        String reversedStr = "";
        for (int i = 0; i < str.length(); i++) {
            reversedStr = reversedStr + str.charAt(str.length() - 1 - i);

        }
        return reversedStr;

    }

    String reverseStrBuilder(String str) {
        var stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
//        return new StringBuilder(str).reverse().toString();

    }

    String reverseStrRecursion(String str) {
        if (str.isEmpty()) {
            return str;

        }
        return reverseStrRecursion(str.substring(1)) + str.charAt(0);

    }

}