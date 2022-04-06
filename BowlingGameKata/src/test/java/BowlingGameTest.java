import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {

 @Test
    public void checkCanRollBall() {
     //arrange
     BowlingGame game = new BowlingGame();
     //act
     game.roll(0);
 }

@Test
    public void checkCanScoreGutterGame(){
     //arrange
     BowlingGame game = new BowlingGame();
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
    //arrange
    BowlingGame game = new BowlingGame();
    //further arrange
    for (int i = 0; i < 20 ; i++) {
        game.roll(1);
    }
    int expected = 20;
    //act and assert
    Assertions.assertEquals(expected, game.getScore());
}

}
