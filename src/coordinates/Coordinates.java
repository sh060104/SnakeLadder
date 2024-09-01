package coordinates;

public class Coordinates {
    public  int row;
    public  int col;
     
    public Coordinates(int row,int col){
        this.row=row;
        this.col=col;

    }
    public String printCordinates(){
        StringBuilder sb=new StringBuilder();
        sb.append("[").append(this.row).append(",").append(this.col).append("]");
        return sb.toString();
    }

}
