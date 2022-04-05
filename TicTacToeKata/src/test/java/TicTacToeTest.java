import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class TicTacToeTest {


    @Test
    public void checkXTakesSquare00(){
        //arrange
        TicTacToe ticTacToeGame = new TicTacToe();
        boolean expectedResult = true;
        //act
        boolean actualResult = ticTacToeGame.isSquareTaken(0,0);
        //assert
        Assertions.assertEquals(expectedResult, actualResult);




    }
//rows
    //X wins all row 1:(col 1 row 1, col 2, row 1, col 3, row 1)
    @Test
     public void checkXWins(){
        //arrange
        TicTacToe ticTacToeGame = new TicTacToe();

        //act

    }
    
    //X wins row 2: (col 1 row 2, col 2, row 2, col 3, row 2)
    //X wins row 3: (col 1 row 3, col 2, row 3, col 3, row 3)

    //O wins row 1: (col 1 row 1, col 2, row 1, col 3, row 1)
    //O wins row 2: (col 1 row 2, col 2, row 2, col 3, row 2)
    //O wins row 3: (col 1 row 3, col 2, row 3, col 3, row 3)
//cols    
    //X wins col 1: (col 1 row 1, col 1, row 2, col 1, row 3)
    //X wins col 2: (col 2 row 1, col 2, row 2, col 2, row 3)
    //X wins col 3: (col 3 row 1, col 3, row 2, col 3, row 3)

    //O wins col 1: (col 1 row 1, col 1, row 2, col 1, row 3)
    //O wins col 2: (col 2 row 1, col 2, row 2, col 2, row 3)
    //O wins col 3: (col 3 row 1, col 3, row 2, col 3, row 3)

//Diagonal win
    //X wins: (col 1 row 1, col 2, row 2, col 3, row 3)
    //X wins: (col 1 row 3, col 2, row 2, col 3, row 1)

    //O wins: (col 1 row 1, col 2, row 2, col 3, row 3)
    //O wins: (col 1 row 3, col 2, row 2, col 3, row 1)

    
    
}
