import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {

    @Test
    public void checkCanMakeGame(){
        BowlingGame game = new BowlingGame();
    }
 @Test

    public void checkCanRollBall() {
     //arrange
     BowlingGame game = new BowlingGame();
     //act
     game.roll(0);
 }



}
