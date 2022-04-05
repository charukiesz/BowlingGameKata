public class TicTacToe {

    //constructor
    public TicTacToe(){}

    //attributes
    private  char [][] gameBoard;

    //gameBoard






    public static void main(String[] args) {

        char [] [] gameBoard = { {' ', ' ', ' '},
                                {' ', ' ', ' '},
                                 {' ',' ',' '}};

        //create instance of TicTacToe print to console empty gameBoard

        //call whoseFirst() to decide who plays first

        // 1- prompt user for input

        // 2 - read input

        // 3 - print gameBoard to screen showing the first play
        //check which square is taken

        //4 - prompt next player for input

        //5 - print gameBoard to screen showing the second play

        //6 - keep a record of which square was taken

        //6 - repeat steps 1-5 above until game is over
    }


    //methods

    //create 2D array to represent nine squares

    public void XWins(){}

    public void OWins(){}

    public void checkTurn(){}

    public boolean isSquareTaken(int column, int row){
        if (gameBoard[column][row] == ' '){
            return false;
        } else return true;
    }


    public boolean setSquare(int column, int row, char play){
        //if square is taken return false - call to isSquareTaken()
        //else set position in array and return true
        return true;
    }

   private void getGameBoard(){}

    public void whoseFirst(){
        //randomly choose between X and O
        }




}
