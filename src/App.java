import player.Player;
import dice.Dice;
import game.Game;
import jumper.Jumper;
import coordinates.Coordinates;
import java.util.HashMap;
import board.Board;

public class App {
    public static void main(String[] args) throws Exception {

         HashMap<String,Jumper> map= new HashMap<>();
         map.put("9",new Jumper(new Coordinates(9, 0),new Coordinates(8, 5)));
         map.put("4",new Jumper(new Coordinates(8, 1),new Coordinates(0, 3)));
         map.put("79",new Jumper(new Coordinates(7, 5),new Coordinates(3, 2)));
         map.put("34",new Jumper(new Coordinates(2, 9),new Coordinates(8, 6)));
         map.put("50",new Jumper(new Coordinates(1, 6),new Coordinates(9, 4)));
         map.put("90",new Jumper(new Coordinates(4, 0),new Coordinates(7, 7)));

        Player p1=new Player();
        p1.setPlayerdetailsfromuserinput(p1);
        p1.getPlayerdetails(); 

        Player p2=new Player();
        p2.setPlayerdetailsfromuserinput(p2);
        p2.getPlayerdetails();

        // Dice dice=new Dice();
        // System.out.println(dice.diceRoll());

        // Coordinates c=new Coordinates(9,4);
        // Coordinates d=new Coordinates(0,4);
        // System.out.println(c.printCordinates());
        // Jumper j=new Jumper (c,d);
        // System.out.println(j.getJumpername());

        Board b=new Board(10,map);
        b.printBoard();

        Game game = new Game(b, new Player[] {p1,p2}, new Dice());
        game.play();





        
        
    }
    
}
