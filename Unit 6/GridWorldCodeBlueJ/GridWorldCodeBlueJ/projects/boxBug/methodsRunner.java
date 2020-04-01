import info.gridworld.grid.*; 
import info.gridworld.actor.*; 
import java.awt.*; 
import java.util.*;

public class methodsRunner
{
    public methodsRunner(){}
    
    public static void main(){
       BoundedGrid g = new BoundedGrid(15,15);
       ActorWorld w = new ActorWorld(g);
       Bug b1 = new Bug(Color.YELLOW);
       w.add(new Location(5,5), b1);
       w.show();
       
    }
}
