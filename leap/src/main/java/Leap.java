class Leap {

    boolean isLeapYear(int year) {
        // on every year that is evenly divisible by 4
        //  except every year that is evenly divisible by 100
        //    unless the year is also evenly divisible by 400
        if (year % 4 != 0){
            return false;

        }
        else if (year % 100 != 0){
            return true;

        }
        else if (year % 400 != 0){
            return false;

        }
        else {
            return true;

        }

    }
}
