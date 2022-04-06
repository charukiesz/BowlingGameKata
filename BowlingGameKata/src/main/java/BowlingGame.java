public class BowlingGame {
//constructor
    BowlingGame(){}

//attributes
private int score = 0;  //Score tally

//methods

    public void roll(int pinsDown){   //Increments the score by the number of pins knocked down in successive rolls
        score += pinsDown;
    }

    public int getScore(){            //Returns the current score
        return score;
    }

}




