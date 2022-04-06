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
    game.doRolls(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
    int expected = 0;
    //act and assert
    Assertions.assertEquals(expected, game.getScore());
    }

    @Test
    public void checkCanScoreAGameOfOnes(){
    //further arrange
    game.doRolls(1,1, 1,1,  1,1,  1,1,  1,1, 1,1,  1,1,  1,1,  1,1, 1,1);
    int expected = 20;
    //act and assert
    Assertions.assertEquals(expected, game.getScore());
    }

    @Test
    public void checkCanScoreSpareFollowedByThree(){
    //further arrange
    game.doRolls(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
    int expected = 16;
    //act and assert
    Assertions.assertEquals(expected,game.getScore());
    }




}
