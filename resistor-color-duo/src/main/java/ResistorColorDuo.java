// enum Color {
//     black,
//     brown,
//     red,
//     orange,
//     yellow,
//     green,
//     blue,
//     violet,
//     grey,
//     white
// }

class ResistorColorDuo {
    // int value(String[] colors) {
    //     String code = "";
    //     for (int i = 0; i < 2; i++) {
    //         code = code + Color.valueOf(colors[i]).ordinal();

    //     }

    //     return Integer.parseInt(code);

    // }


    int value(String[] colors) {
        String code = "";
        for (int i = 0; i < 2; i++) {
            code = code + colorCode(colors[i]);

        }

        return Integer.parseInt(code);

    }

    int colorCode(String color) {
        switch (color) {
            case "black":
                return 0;

            case "brown":
                return 1;

            case "red":
                return 2;

            case "orange":
                return 3;

            case "yellow":
                return 4;

            case "green":
                return 5;

            case "blue":
                return 6;

            case "violet":
                return 7;

            case "grey":
                return 8;

            case "white":
                return 9;

        }


        return -1;

    }

    public static void main(String[] args) {
        var resistorColorDuo = new ResistorColorDuo();
        var colorArr = new String[]{"brown", "green", "violet"};
        System.out.println(resistorColorDuo.value(colorArr));


    }
}
