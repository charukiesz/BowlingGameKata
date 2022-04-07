public class BowlingGame {
//Constructor
    BowlingGame(){}

//Attributes
private int currentRoll = 0;        //Roll counter
private int [] rolls = new int[21]; //Array to store sequence of rolls

//Sequence of pins down for all the rolls in a game that has been played
public void doRolls(int... rolls){
        for (int pinsDown : rolls) {
            roll(pinsDown);
        }
    }

//Methods
    //Method to append the number of pins knocked down to the rolls array, after each roll
    public void roll(int pinsDown){
        rolls[currentRoll++] = pinsDown;
    } //

    public int getScore() {
        int score = 0;
        int cursor = 0;
        for (int frame = 0; frame < 10; frame++) {     //Iterates over the rolls array frame by frame
            if(isStrike(cursor)){                     //Check for a Strike
                score += 10 + rolls[cursor + 1] + rolls[cursor + 2]; //Calculates the score for a Strike by adding on the bonus from the next frame
                cursor++;                               //Since only one roll in the current frame, move cursor to the next frame
        }else if (isSpare(cursor)) {                     //Check for a Spare
                score = 10 + rolls[cursor + 2];        //Spare score is equal to 10 plus the number of pins down in the first roll of the next frame
                cursor += 2;                           //Move cursor to the next frame
            } else {
                score += rolls[cursor] + rolls[cursor + 1];
                cursor += 2;
            }

        }return score;
    }

    //Method to check condition of a Spare
    private boolean isSpare(int cursor){
        return (rolls[cursor] + rolls[cursor + 1] == 10);
    }

    //Method to check condition for a Strike
    private boolean isStrike(int cursor){
        return rolls[cursor] == 10;
    }

}




