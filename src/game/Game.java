package game;
import board.Board;
import player.Player;
import coordinates.Coordinates;
import dice.Dice;
import jumper.Jumper;

public class Game {
    Board board;
    Player []players;
    boolean []isallowed;
    int turn;
    Coordinates []places;
    Dice dice;

    public Game(Board board,Player[] players,Dice dice){
        this.board=board;
        this.players=players;
        this.dice=dice;
        turn=0;
        isallowed=new boolean[players.length];
        places=new Coordinates[players.length];

        for(int i=0;i<players.length;i++) places[i]=new Coordinates(board.getboardsize(),0 );


    }
    public void play(){
        while(true){
            int num=dice.diceRoll();
            System.out.println(players[turn].getPlayername()+" rolled -> "+num);
            if(!isallowed[turn]){
                if(num!=1){
                    turn=1-turn;
                    continue;
                }else{
                    isallowed[turn]=true;
                }
            }
            Coordinates newCoordinates =getnewCoordinates(places[turn],num);
            if (newCoordinates.row < 0) {
                System.out.println(players[turn].getPlayername() + " has won");
                return;
            }

            places[turn] = newCoordinates;
            turn  = 1-turn;
        }
    }

    private Coordinates getnewCoordinates(Coordinates oldcoordinates, int num){
        int row=oldcoordinates.row;
        int col=oldcoordinates.col;
        
        while (num>0) {
            if (row%2 != 0) {
                if (col == board.getboardsize()-1) row--;
                else col++;

            } else {
                if (col == 0) row--;
                else col--;
            }

            num--;
        }
        if (row < 0) return new Coordinates(row, col);
        if (checkIfJumperExists(row,col)) {
            Jumper jumper = board.jumpers.get(board.board[row][col]);

            return jumper.end;

        }

        return new Coordinates(row, col);
        
    }
    private boolean checkIfJumperExists(int row, int col) {
        return board.jumpers.containsKey(board.board[row][col]);
    }
        
    
}
