package player;

import java.util.Scanner;

public class Player {
    String name;
    String contactno;
    String email;
    String address;
    int age;

    public void setplayerdetails(String name,String contactno,String email,String address, int age ){

        this.name=name;
        this.contactno=contactno;
        this.email=email;
        this.address=address;
        this.age=age;
    }

    public void setPlayername(String name){
         this.name=name; 
    }
    public void getPlayerdetails(){
        System.out.println("player name :"+this.name);
        System.out.println("player contact no :"+this.contactno);
        System.out.println("player email id :"+this.email);
        System.out.println("player  address :"+this.address);
        System.out.println("player age :"+this.age);
    }
    public String getPlayername(){
        return this.name;
    }

    public  void setPlayerdetailsfromuserinput(Player p){
        Scanner s=new Scanner (System.in);
        System.out.println("ENTER PLAYER DETAILS->");
        System.out.println("enter player name:");
        String name=s.nextLine();
        System.out.println("enter player contactno:");
        String contactno=s.nextLine();
        System.out.println("enter player email:");
        String email=s.nextLine();
        System.out.println("enter player address:");
        String address=s.nextLine();
        System.out.println("enter player age:");
        int age=s.nextInt();
        
        p.setplayerdetails(name,contactno,email,address,age);
        


    } 


}
