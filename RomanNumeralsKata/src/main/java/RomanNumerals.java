
import java.util.HashMap;
import java.util.Map.Entry;

public class RomanNumerals {

    //constructor
    public RomanNumerals() {
    }

    //attribute
    public Integer inputNumber = 1;


    private static HashMap<String, Integer> romanNumerals = new HashMap<String, Integer>() {{  //Dictionary of Roman Numerals
        put("I", 1);
        put("II", 2);
        put("III", 3);
        put("IV", 4);
        put("V", 5);
        put("VI", 6);
        put("VII", 7);
        put("VIII", 8);
        put("IX", 9);
        put("X", 10);

    }};


    //Dynamically populate data structure at runtime
/*if (inputNumber >= 1 & inputNumber <= 10) {
        return "I";

    }else if (inputNumber == 0 || inputNumber >= 11) {
        return "No conversion for this number, please enter a number between 1 and 10 inclusive."; */

    //methods
    public String getRomanNumeral(Integer inputNumber) {
        //if hashmap contains the inputNumber
        if (romanNumerals.containsValue(inputNumber)) {
            //iterate over each entry of the hashmap
            for (Entry<String, Integer> entry : romanNumerals.entrySet()) {
                //if the value is equal to the corresponding value in the entry set print the key
                if (entry.getValue() == inputNumber) {
                    return entry.getKey();
                }
            }

        } else {
            return "Number not recognised";
        }
        return "Number not recognised";
        /*if (inputNumber >= 1 & inputNumber <= 10) {
            return "I";

        }else if (inputNumber == 0 || inputNumber >= 11) {
            return "No conversion for this number, please enter a number between 1 and 10 inclusive."; */
    }



}






