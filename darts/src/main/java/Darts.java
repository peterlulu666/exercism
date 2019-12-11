class Darts {

    double distance = 0;

    Darts(double x, double y) {
        distance = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);

    }

    int score() {
        if (distance <= 1) {
            return 10;

        } else if (distance <= 5) {
            return 5;

        } else if (distance <= 10) {
            return 1;

        } else {
            return 0;

        }


    }

    public static void main(String[] args) {
        var darts = new Darts(1, 2);
        System.out.println(darts.score());


    }

}
