class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        for (int i = 0; i < dnaStrand.length(); i++) {
            if (dnaStrand.charAt(i) == 'G') {
                rnaStrand = rnaStrand + "C";

            } else if (dnaStrand.charAt(i) == 'C') {
                rnaStrand = rnaStrand + "G";

            } else if (dnaStrand.charAt(i) == 'T') {
                rnaStrand = rnaStrand + "A";

            } else if (dnaStrand.charAt(i) == 'A') {
                rnaStrand = rnaStrand + "U";

            }


        }

        return rnaStrand;

    }

    public static void main(String[] args) {
        var rnaTranscription = new RnaTranscription();
        System.out.println(rnaTranscription.transcribe("GCTA"));


    }

}
