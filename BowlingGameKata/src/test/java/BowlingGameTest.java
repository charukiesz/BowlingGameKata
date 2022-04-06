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
    public void checkCanRollBall() {
    //act
     game.roll(0);
 }

@Test
    public void checkCanScoreGutterGame(){
     //further arrange
    for (int i = 0; i < 20 ; i++) {
        game.roll(0);
    }
     int expected = 0;
     //act and assert
    Assertions.assertEquals(expected, game.getScore());

}
@Test
    public void checkCanScoreAGameOfOnes(){
    //further arrange
    for (int i = 0; i < 20 ; i++) {
        game.roll(1);
    }
    int expected = 20;
    //act and assert
    Assertions.assertEquals(expected, game.getScore());
}

}
