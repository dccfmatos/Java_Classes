public class secodsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    // it's final so that we can´t change the value of the variable constant)

    public static String getDurationString(long minutes, long seconds){

        if (minutes >= 0 && seconds >= 0 && seconds <= 59){

            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;

            String hoursString = hours + "h";
            if (hours < 10){
                hoursString = "0" + hoursString;
            }

            String minutesString = remainingMinutes + "m";
            if (remainingMinutes < 10){
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s";
            if (seconds < 10){
                secondsString = "0" + secondsString;
            }

            return hoursString + " " + minutesString + " " + secondsString;

        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(long seconds) {

        if (seconds >= 0){

            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;

            String x = getDurationString(minutes, remainingSeconds);
            return x;
        }
        return INVALID_VALUE_MESSAGE;
    }
}
