public class RomanNumerals {


    public String getRomanNumeral(int inputNumber) {
        //If the input number is greater than or equal to 1 or less than or equal to 3000
        // return the roman numeral equivalent for that number
        //Data structure to store key value pairs
        //Dynamically populate data structure at runtime

        //refactor cases for 1 up to 3000 into one line of logic
        if (inputNumber >= 1 & inputNumber <= 3000) {
            return "I";
            //refactor cases for 0 and 3000 into one line of logic
        }else if (inputNumber == 0 || inputNumber >= 3000) {
            return "No conversion for this number, please enter a number between 1 and 3000.";
        }else{
            return "Number not recognised";
        }
    }
}





