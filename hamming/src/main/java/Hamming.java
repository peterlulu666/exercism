class Hamming {

    String leftStrand;
    String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

    }

    int getHammingDistance() {
        if (this.leftStrand.isEmpty() && !this.rightStrand.isEmpty()){
            throw new IllegalArgumentException("left strand must not be empty. ");

        }
        else if (!this.leftStrand.isEmpty() && this.rightStrand.isEmpty()){
            throw new IllegalArgumentException("right strand must not be empty. ");

        }
        if (this.leftStrand.length() != this.rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length. ");
        }

        // leftStrand.chatAt[1] != rightStrand.chatAt[1]
        // count ++;
        int count = 0;
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                count++;

            }

        }
        return count;

    }

    public static void main(String[] args) {
        var hamming = new Hamming("GAGCCTACTAACGGGAT", "CATCGTAATGACGGCCT");
        System.out.println(hamming.getHammingDistance());


    }

}

