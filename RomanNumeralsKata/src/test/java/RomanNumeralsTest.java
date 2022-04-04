
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RomanNumeralsTest {

    @Test
    public void checkInputNumber1(){
        //arrange
        RomanNumerals romanNumeral = new RomanNumerals();
        //act
        String expectedResult = "I";
        String  actual = romanNumeral.getRomanNumeral(1);
        //assert
        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void checkInputNumberZero(){
        //arrange
        RomanNumerals romanNumeral  = new RomanNumerals();
        //act
        String expectedResult = "No conversion for this number, please enter a number between 1 and 3000.";
        String actual = romanNumeral.getRomanNumeral(0);
        //assert
        Assertions.assertEquals(expectedResult, actual);
    }
    @Test
    public void checkInputNumber3001(){
        //arrange
        RomanNumerals romanNumeral = new RomanNumerals();
        //act
        String expectedResult = "No conversion for this number, please enter a number between 1 and 3000.";
        String actual = romanNumeral.getRomanNumeral(3001);
        //assert
        Assertions.assertEquals(expectedResult, actual);
    }


}
