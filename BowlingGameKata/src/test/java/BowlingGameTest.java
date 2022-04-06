import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {

    private BowlingGame game;

    @BeforeEach
    public void setGame(){
        game = new BowlingGame();   //Create an instance of the game for each test
    }

    @Test
    public void checkCanScoreGutterGame(){
    //further arrange
    doRolls(20,0);
    int expected = 0;
    //act and assert
    Assertions.assertEquals(expected, game.getScore());
    }

    @Test
    public void checkCanScoreAGameOfOnes(){
    //further arrange
    doRolls(20, 1);
    int expected = 20;
    //act and assert
    Assertions.assertEquals(expected, game.getScore());
    }

    @Test
    public void checkCanScoreSpareFollowedByThree(){
    //further arrange
    game.roll(5);
    game.roll(5);
    game.roll(3);
    doRolls(17, 0);
    int expected = 16;
    //act and assert
    Assertions.assertEquals(expected,game.getScore());
    }


    //method to simulate number of rolls and pins knocked down
    private void doRolls(int times, int pinsDown){
        for (int i = 0; i < times; i++) {
            game.roll(pinsDown);
        }
    }

}
