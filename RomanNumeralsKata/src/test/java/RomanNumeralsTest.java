
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
    public void checkInputNumber2(){
        //arrange
        RomanNumerals romanNumeral = new RomanNumerals();
        //act
        String expectedResult = "II";
        String  actual = romanNumeral.getRomanNumeral(2);
        //assert
        Assertions.assertEquals(expectedResult, actual);
    }
    @Test
    public void checkInputNumber4(){
        //arrange
        RomanNumerals romanNumeral = new RomanNumerals();
        //act
        String expectedResult = "IV";
        String  actual = romanNumeral.getRomanNumeral(4);
        //assert
        Assertions.assertEquals(expectedResult, actual);
    }
    @Test
    public void checkInputNumber5(){
        //arrange
        RomanNumerals romanNumeral = new RomanNumerals();
        //act
        String expectedResult = "V";
        String  actual = romanNumeral.getRomanNumeral(5);
        //assert
        Assertions.assertEquals(expectedResult, actual);
    }
    @Test
    public void checkInputNumber8(){
        //arrange
        RomanNumerals romanNumeral = new RomanNumerals();
        //act
        String expectedResult = "VIII";
        String  actual = romanNumeral.getRomanNumeral(8);
        //assert
        Assertions.assertEquals(expectedResult, actual);
    }
    @Test
    public void checkInputNumber9(){
        //arrange
        RomanNumerals romanNumeral = new RomanNumerals();
        //act
        String expectedResult = "IX";
        String  actual = romanNumeral.getRomanNumeral(9);
        //assert
        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void checkInputNumberZero(){
        //arrange
        RomanNumerals romanNumeral  = new RomanNumerals();
        //act
        String expectedResult = "No conversion for this number, please enter a number between 1 and 10 inclusive.";
        String actual = romanNumeral.getRomanNumeral(0);
        //assert
        Assertions.assertEquals(expectedResult, actual);
    }
    @Test
    public void checkInputNumber3001(){
        //arrange
        RomanNumerals romanNumeral = new RomanNumerals();
        //act
        String expectedResult = "No conversion for this number, please enter a number between 1 and 10 inclusive.";
        String actual = romanNumeral.getRomanNumeral(11);
        //assert
        Assertions.assertEquals(expectedResult, actual);
    }


}
