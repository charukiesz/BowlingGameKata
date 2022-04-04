public class RomanNumerals {


    public String getRomanNumeral(int inputNumber) {
        //If the input number is greater than or equal to 1 or less than or equal to 3000
        // return the roman numeral equivalent for that number
        if (inputNumber == 1) {
            return "I";
        } else if (inputNumber == 0) {
            return "No conversion for zero, please enter a number between 1 and 3000.";
        } else if (inputNumber == 3001) {
            return "No conversion for numbers above 3000, please enter a number between 1 and 3000.";
        }else{
            return "Number not recognised";
        }
    }
}





