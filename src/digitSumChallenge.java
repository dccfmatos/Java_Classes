public class digitSumChallenge {

    public static int sumDigits(int number){

        if (number < 10){
            return -1;
        } else {

            int sum = 0;
            while (number > 0){

                int digit = number % 10;
                sum += digit;

                number = number/10;
            }
            return sum;
        }
    }
}
