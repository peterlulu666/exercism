import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        var product = new BigInteger("2");
        product = product.pow(square - 1);
        return product;

    }

    BigInteger grainsOnBoard() {
        var sum = new BigInteger("0");
        for (int i = 1; i <= 64; i++) {
            sum = sum.add(grainsOnSquare(i));

        }
        return sum;

    }

    public static void main(String[] args) {
        var grains = new Grains();
        System.out.println(grains.grainsOnSquare(10));
        System.out.println(grains.grainsOnBoard());


    }

}
