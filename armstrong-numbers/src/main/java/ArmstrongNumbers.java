class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String strNumber = "" + numberToCheck;
        int digits = strNumber.length();
        double sum = 0;
        for (int i = 0; i < strNumber.length(); i++) {
            sum = sum + Math.pow(Integer.parseInt(String.valueOf(strNumber.charAt(i))), digits);

        }
        if (numberToCheck == sum) {
            return true;

        } else {
            return false;

        }

    }

    public static void main(String[] args) {
        var armstrongNumbers = new ArmstrongNumbers();
        System.out.println(armstrongNumbers.isArmstrongNumber(9));
        System.out.println(armstrongNumbers.isArmstrongNumber(10));
        System.out.println(armstrongNumbers.isArmstrongNumber(153));
        System.out.println(armstrongNumbers.isArmstrongNumber(154));


    }

}
