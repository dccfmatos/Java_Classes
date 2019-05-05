public class calcFeetandInches {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet < 0) {
            return -1;
        }
        if (inches < 0 || inches > 13) {
            return -1;
        }

        double centimeters = feet * 12 * 2.54;
        centimeters += inches * 2.34;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

            if (inches < 0){
                return -1;
            }

            double feet = (int) inches / 12;
            double remaining = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remaining);
        }


}
