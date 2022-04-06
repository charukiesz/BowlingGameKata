public class BowlingGame {
//constructor
    BowlingGame(){}

//attributes
private int currentRoll = 0;        //Roll counter
private int [] rolls = new int[21]; //Array to store sequence of rolls

//methods

    public void roll(int pinsDown){
        rolls[currentRoll++] = pinsDown;
    }

    public int getScore() {
        int score = 0;
        int cursor = 0;
        for (int frame = 0; frame < 10; frame++) {                    //Iterates over the rolls array frame by frame
            if (rolls[cursor] + rolls[cursor + 1] == 10) {   //Spare
                score = 10 + rolls[cursor + 2];           //Spare score is equal to 10 plus the number of pins down in the first roll of the next frame
                cursor += 2;                            //move cursor to the next frame
            } else {
                score += rolls[cursor] + rolls[cursor + 1];
                cursor += 2;
            }

        }return score;
    }
}




