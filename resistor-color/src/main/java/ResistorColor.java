class ResistorColor {
    int colorCode(String color) {
        for (int i = 0; i < colors().length; i++) {
            if (color.equals(colors()[i])) {
                return i;

            }

        }

        return -1;
    }

    String[] colors() {
        return new String[]{
                "black",
                "brown",
                "red",
                "orange",
                "yellow",
                "green",
                "blue",
                "violet",
                "grey",
                "white"};

    }

    public static void main(String[] args) {
        var resistorColor = new ResistorColor();
        System.out.println(resistorColor.colorCode("Red"));


    }
}
//
//enum Color {
//    black,
//    brown,
//    red,
//    orange,
//    yellow,
//    green,
//    blue,
//    violet,
//    grey,
//    white
//}
//
//class ResistorColor {
//    int colorCode(String color) {
//        return Color.valueOf(color).ordinal();
//
//    }
//
////    String[] colors() {
////        String[] colors = new String[Color.values().length];
////        for (int i = 0; i < Color.values().length; i++) {
////            colors[i] = String.valueOf(Color.values()[i]);
////
////        }
////        return colors;
////
////    }
//
//    public static void main(String[] args) {
//        var resistorColor = new ResistorColor();
//        System.out.println(resistorColor.colorCode("red"));
//
//
//    }
//
//}
