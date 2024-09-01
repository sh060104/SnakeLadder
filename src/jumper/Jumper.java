package jumper;



import coordinates.Coordinates;

public class Jumper {
    public Coordinates start;
    public Coordinates end;
    public String name;

    public Jumper(Coordinates start,Coordinates end){
        this.start=start;
        this.end=end;
        if(start.row>end.row) this.name="LADDER";
        else this.name="SNAKE";
    }
    public  String getJumpername(){
        return this.name;
    }

}
